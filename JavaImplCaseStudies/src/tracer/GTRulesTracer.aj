
package tracer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import inferences.DBRecord;


public aspect GTRulesTracer {



	// trace-switch (on/off) for logging and recording 
	private boolean isDBconnected=false;
	private boolean isRecording=false;	
	private RuleInstanceExtraction ruleInstance= null;
	//Logger GTlogger = Logger.getLogger("GTlog"); 	
	
	private long constructionTime= 0;





	//*************************************************************************************
	//point-cut to define internal states with no conditions to observe the whole execution 		
	pointcut stateTriggers(): 	
		!within(tracer.*) && 
		!execution(* *.main(String[]));






	//***********************************************
	// Advice ***************************************

	before() : stateTriggers() {


		// start and end observations		
		if (thisJoinPoint.getKind().equals(JoinPoint.METHOD_CALL) &&
				thisJoinPoint.getSignature().getName().equals("endStartSeparation")){			

			this.endStartSwitchSeparation(thisJoinPoint.getArgs()[0].toString());			
		}



		try {
			this.doAdvice(false, thisJoinPoint);
		}
		catch(Exception ex){
			//this.GTlogger.info("## Error in advice before() : exMessage=" + ex.getMessage());	

		}	
	}



	after(): stateTriggers() {

		try {
			this.doAdvice(true, thisJoinPoint);
		}
		catch(Exception ex){
			//this.GTlogger.info("## Error in after() : exMessage=" + ex.getMessage());	
		}

	}



	after() returning(Object returnObject) : stateTriggers() {


		try {
			this.doAdviceReturning(thisJoinPoint, returnObject);
		}
		catch(Exception ex){
			//this.GTlogger.info("## Error in after() returning : exMessage=" + ex.getMessage());			
		}

	}






	after() throwing : stateTriggers() {

		this.catchExceptionHandler(thisJoinPoint, true);
	}


	private void catchExceptionHandler (JoinPoint thisjoinPoint, boolean isAfter){

		//this.GTlogger.info("\nCatch exception: " + thisjoinPoint + " isAfter " + isAfter);


		if (!this.isDBconnected || !this.isRecording || this.ruleInstance==null){
			return;
		}


		// the execution is going to stop! so we need to generate rule instances at this point
		this.ruleInstance.isApplicable=false;
		this.doCloseCurrentTracing();	

	}




	private void doAdvice(boolean isAdviceAfter, JoinPoint getJoinPoint){		


		if (isRecording){
			//this.GTlogger.info(getJoinPoint.toString() + " Advice=" + isAdviceAfter);
		}




		// check recording ..
		if(!isRecording
				|| getJoinPoint==null
				|| getJoinPoint.getSignature().getName().equals("endStartSeparation")
				|| getJoinPoint.getKind().equals(JoinPoint.PREINITIALIZATION)
				|| getJoinPoint.getKind().equals(JoinPoint.CONSTRUCTOR_CALL)
				|| getJoinPoint.getKind().equals(JoinPoint.STATICINITIALIZATION)){
			return;
		}


		System.out.println(getJoinPoint.hashCode() + " Advice=" + isAdviceAfter+ " " + getJoinPoint.toString() );



		// set auto rule separator for inner rules based on method executions		
		if (getJoinPoint.getKind().equals(JoinPoint.METHOD_EXECUTION)){

			if (!isAdviceAfter){				
				// start nested inner rule 
				this.ruleInstance.strExecuatedPath+="/#sr(" + getJoinPoint.hashCode() + ")";

			}
			else {
				// end nested inner rule 
				this.ruleInstance.strExecuatedPath+="/#er(" + getJoinPoint.hashCode() + ")";
			}
		}





		// check this() and target() objects to be defined in the scope
		this.ruleInstance.isObjectInScope(getJoinPoint.getThis());
		if (getJoinPoint.getTarget() !=null && 
				getJoinPoint.getThis()!=getJoinPoint.getTarget()){

			this.ruleInstance.isObjectInScope(getJoinPoint.getTarget());
		}





		// advice before
		if (!isAdviceAfter){

			switch (getJoinPoint.getKind()){


			case JoinPoint.METHOD_CALL:


				// store join point hash to catch relevant JoinPoints, return object type, value and their hashs
				if (this.ruleInstance.methdoCallJoinPointHashCode ==0){
					this.ruleInstance.methdoCallJoinPointHashCode=getJoinPoint.hashCode();					
				}


				break;

			case JoinPoint.METHOD_EXECUTION:

				// 	check/add passing args in the scope
				for (Object argObject : getJoinPoint.getArgs()){
					this.ruleInstance.isObjectInScope(argObject);
				}


				// add rule parameters 				
				if (this.ruleInstance.strMethodSignature.length()==0){


					this.ruleInstance.ruleParameters.add("thisOid," + System.identityHashCode(getJoinPoint.getThis()));
					this.ruleInstance.setRuleMethodSignature(getJoinPoint.getSignature().toString());


					MethodSignature mSignature = (MethodSignature) getJoinPoint.getSignature();
					String[] parNames=mSignature.getParameterNames();

					if (parNames.length<1 || parNames.length != getJoinPoint.getArgs().length){
						break;
					}


					// Reflection get parameters types
					Class[] parTypes = mSignature.getParameterTypes();					
					int index=-1;					

					for (Object argObject : getJoinPoint.getArgs()){

						index++;
						if (argObject==null){
							this.ruleInstance.ruleParameters.add(
									" "
											+ ruleInstance.strSeparator + parTypes[index].getSimpleName()
											+ ruleInstance.strSeparator + parNames[index]	
													+ ruleInstance.strSeparator + "null");
						}
						else {
							this.ruleInstance.ruleParameters.add(
									System.identityHashCode(argObject)
									+ ruleInstance.strSeparator + parTypes[index].getSimpleName()
									+ ruleInstance.strSeparator + parNames[index]
											+ ruleInstance.strSeparator + argObject.toString());
						}
					}

				}		
				break;


			case JoinPoint.FIELD_SET:

				// check if the passing set arguments have not been read!
				this.ruleInstance.isObjectInScope(getJoinPoint.getArgs()[0]);


				// set write access from object field
				this.ruleInstance.currentJoinPoint = getJoinPoint;
				this.ruleInstance.setWriteAccessFromField(
						getJoinPoint.getTarget(), 
						getJoinPoint.getSignature().getName(), 
						getJoinPoint.getArgs()[0]);


				break;

			case JoinPoint.EXCEPTION_HANDLER:	

				this.catchExceptionHandler(getJoinPoint, false);
				break;

			default:				
				break;

			}



		}

		// advice after
		else if (getJoinPoint.getKind().equals(JoinPoint.INITIALIZATION)){

			// set it to be initialized
			this.ruleInstance.currentJoinPoint = getJoinPoint;
			this.ruleInstance.setInitiallingObject(getJoinPoint.getThis());

		}

		// advice after
		else if (getJoinPoint.getKind().equals(JoinPoint.METHOD_CALL)){

			// set read/write access from call for collection object	###(for void return only)###
			MethodSignature mSignature = (MethodSignature) getJoinPoint.getSignature();

			boolean isReturnVoid = mSignature.getReturnType().equals(void.class);

			if (isReturnVoid && 
					(getJoinPoint.getTarget() instanceof Collection ||
							getJoinPoint.getTarget() instanceof Object[])){

				this.ruleInstance.currentJoinPoint = getJoinPoint;
				this.ruleInstance.setReadWriteAccessFromCall(
						getJoinPoint.getTarget(), 
						getJoinPoint.getSignature().getName(), "void");	
			}

		}


	}



	private void doAdviceReturning(JoinPoint getJoinPoint, Object returnObject){


		if (!isRecording || returnObject==null || getJoinPoint==null){
			return;
		}



		switch (getJoinPoint.getKind()){


		case JoinPoint.CONSTRUCTOR_CALL:

			// check if this is a collection type if so do initialize it
			if (returnObject instanceof Collection){

				// add it in the scope
				this.ruleInstance.isObjectInScope(returnObject);

				// set it to be initialised
				this.ruleInstance.currentJoinPoint = getJoinPoint;
				this.ruleInstance.setInitiallingObject(returnObject);
			}

			break;



		case JoinPoint.FIELD_GET:

			// add it in the scope
			this.ruleInstance.isObjectInScope(returnObject);


			// set required contexts
			//this.ruleInstance.currentJoinPoint = thisJoinPoint;
			this.ruleInstance.setReadAccessFromField(
					getJoinPoint.getTarget(), 
					returnObject, 
					getJoinPoint.getSignature().getName());

			break;	



		case JoinPoint.METHOD_CALL:



			// set read/write access from call for collection object	##(for all return except void)##			
			MethodSignature mSignature = (MethodSignature) getJoinPoint.getSignature();

			if (!mSignature.getReturnType().equals(void.class) && 
					(getJoinPoint.getTarget() instanceof Collection ||
							getJoinPoint.getTarget() instanceof Object[])){

				this.ruleInstance.currentJoinPoint = getJoinPoint;
				this.ruleInstance.setReadWriteAccessFromCall(
						getJoinPoint.getTarget(), 
						getJoinPoint.getSignature().getName(),
						returnObject);	
			}



			// check return from main method (rule instance)
			// store join point hash to catch relevant return object type, value and hash value
			if (this.ruleInstance.methdoCallJoinPointHashCode == getJoinPoint.hashCode()){

				this.ruleInstance.ruleParameters.add(
						System.identityHashCode(returnObject)
						+ ruleInstance.strSeparator + returnObject.getClass().getSimpleName()
						+ ruleInstance.strSeparator + "return"
						+ ruleInstance.strSeparator + String.valueOf(returnObject));

				this.ruleInstance.strReturnObjectId=System.identityHashCode(returnObject)+"";	


			}


			break;


		default:			
			break;

		}


	}











	// Rule instance separations based on passing method names

	private void endStartSwitchSeparation(String actionMethodName){

		switch (actionMethodName){

		case "#doStart":

			this.doStart();
			break;	            

		case "#doStop":

			this.doStop();	        
			break;

		case "#doGTLearning":

			this.doGTLearning();       
			break;

		default:

			this.doProceed(actionMethodName);	        	
			break;
		}
	}










	// Switch to start and end observation process

	private void doStart(){


		if (this.isDBconnected){
			return;
		}


		// open DB and ini for recording..
		DBRecord.openConnection();
		this.ruleInstance=null;
		this.isDBconnected=true;
		this.isRecording=false;


		// set logger
		System.out.println("\n #Tracing started..");
		//GTlogger.setUseParentHandlers(false);
//		try {  
//
//			boolean isAppend=false;
//			FileHandler fh = new FileHandler("GT.log", isAppend);
//
//			GTlogger.addHandler(fh);
//			SimpleFormatter formatter = new SimpleFormatter() {
//				public String format(LogRecord record) {
//					return record.getMessage() + System.lineSeparator();	        		
//				}
//			};
//			//			GTlogger.setLevel(Level.ALL);
//			GTlogger.setLevel(Level.OFF);
//			fh.setFormatter(formatter); 
//			//GTlogger.addHandler(new ConsoleHandler());
//			GTlogger.setUseParentHandlers(false);	       
//
//		} 
//		catch (SecurityException e) { e.printStackTrace(); }
//		catch (IOException e) {  e.printStackTrace(); }

	}



	private void doProceed(String methodName){

		// DB must be up and connected
		if (this.isDBconnected){


			if (this.isRecording){
				// save the last observation 
				this.doCloseCurrentTracing();				
			}


			// open new observation
			this.ruleInstance= new RuleInstanceExtraction(methodName);    	

			// open recording
			this.isRecording=true;
		}

	}


	private void doCloseCurrentTracing(){


		// record and close current observation 
		if (this.ruleInstance!=null && 
				this.ruleInstance.Observation_ID!=-1){   

			this.setRueInstance();
		}


		// stop current recording ..
		this.ruleInstance=null;
		this.isRecording=false;
	}



	private void doStop(){


		if (!this.isDBconnected){
			return;
		}


		if (this.isRecording){
			// save the last observation 
			this.doCloseCurrentTracing();				
		}



		// close database 
		DBRecord.closeConnection();  
		this.ruleInstance=null;
		this.isDBconnected=false;
		this.isRecording=false;

		System.out.println("\n The extraction of rule instance completed\n\n #Tracing stopped");
		System.out.println("total construction Time=" + constructionTime);


//		try {
//			PrintWriter out = new PrintWriter(new FileWriter(new File("constructionTime.txt"), true));
//			out.write(constructionTime + System.lineSeparator());
//			out.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}



	private void setRueInstance(){

		// close current logging observation
		this.ruleInstance.closeLoggingCurrentObservation();


		long beforeTime = System.nanoTime();

		// generate pre and post graph and save them
		this.ruleInstance.generateRuleInstance();

		constructionTime += (System.nanoTime()-beforeTime) ;


		//this.GTlogger.info(System.lineSeparator() + "\trule-ins extracted : " + this.ruleInstance.strMethodName + " - size : " + this.ruleInstance.iObjectsCount + " - " + System.lineSeparator() + System.lineSeparator());
		//System.out.println("\trule-ins extracted : " + this.ruleInstance.strMethodName + " - size : " + this.ruleInstance.iObjectsCount);

	}



	private void doGTLearning(){

//		RuleExtraction testGenerlaisingProcess = new RuleExtraction();
//		int iRepeatedMultiObjects =2;
//		testGenerlaisingProcess.generaliseRuleInstance(iRepeatedMultiObjects);	
//
//		System.out.println("\n Rule Generalizstion completed ");
	}










}
