package visualisation;

import inferences.DBRecord;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.rowset.CachedRowSetImpl;

public class InstanceRuleVisualisation extends JPanel {


	private JTable tableObservation=null;
	private JTextPane textPanesRuleDetails=null;
	private LhsRhs lhsRhsGraphs = new LhsRhs();
	private DefaultListModel<String> modelListPartialPath = null;



	// selected options from menu
	private int iSelectedObservationID=-1;
	private boolean isViewingMinimalRule=false;
	private int iLevelOption=3;




	public InstanceRuleVisualisation() {

		setLayout(new BorderLayout(0, 0));

		// setting and listing instances
		this.setRuleInstanceSetting();


		// fill list of observed rule instances 
		this.fillObservationList();
		
	}



	private void setRuleInstanceSetting(){


		// add sub JMenuBar in north of main panel
		JMenuBar subMenuBar= new JMenuBar();
		this.setSubJMenuBar(subMenuBar);
		add(subMenuBar, BorderLayout.NORTH);



		// list of instances to be added in the west
		this.observationList();



		// partial path setting
		this.partialPath();



		// view rule panels ; details and pair of graphs
		this.viewRulePanels();
	}



	private void setSubJMenuBar(JMenuBar subMenuBar){


		subMenuBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		subMenuBar.setPreferredSize(new Dimension(0, 28));
		subMenuBar.setBackground(SystemColor.white);

		// ----------------------------------------
		// View 
		JMenu viewMenu= new JMenu("View");
		viewMenu.setIcon(this.getImageIcon("/icons/view.gif"));
		subMenuBar.add(viewMenu);

		// minimal rule only
		JMenuItem minRuleMenuItem= new JMenuItem("View minimal rule only");
		minRuleMenuItem.setIcon(this.getImageIcon("/icons/viewMinRule.gif"));
		minRuleMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!isViewingMinimalRule){
					isViewingMinimalRule=true;

					viewRuleInstances();
				}								
			}
		});
		viewMenu.add(minRuleMenuItem);

		// mid
		JMenuItem contextRuleMenuItem= new JMenuItem("View contexts");
		contextRuleMenuItem.setIcon(this.getImageIcon("/icons/viewContext.gif"));
		contextRuleMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (isViewingMinimalRule){
					isViewingMinimalRule=false;
					viewRuleInstances();
				}				
			}
		});
		viewMenu.add(contextRuleMenuItem);




		// ----------------------------------------
		// Abstraction level
		JMenu AbstractionLevelMenu= new JMenu("level");
		AbstractionLevelMenu.setIcon(this.getImageIcon("/icons/level.gif"));
		AbstractionLevelMenu.setToolTipText("Level of abstraction");
		subMenuBar.add(AbstractionLevelMenu);

		// High =1
		JMenuItem highAbstractionMenuItem= new JMenuItem("Abstraction - hide object attributes");
		highAbstractionMenuItem.setIcon(this.getImageIcon("/icons/levelHigh.gif"));
		highAbstractionMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (iLevelOption!=1){
					iLevelOption=1;
					viewRuleInstances();
				}				
			}
		});
		AbstractionLevelMenu.add(highAbstractionMenuItem);

		// mid = 2
		JMenuItem midAbstractionMenuItem= new JMenuItem("Abstraction - view collection object as association");
		midAbstractionMenuItem.setIcon(this.getImageIcon("/icons/levelmid.gif"));
		midAbstractionMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (iLevelOption!=2){
					iLevelOption=2;
					viewRuleInstances();
				}				
			}
		});
		AbstractionLevelMenu.add(midAbstractionMenuItem);

		// low = 3
		JMenuItem lowAbstractionMenuItem= new JMenuItem("Abstraction - view collection object details as object entity");
		lowAbstractionMenuItem.setIcon(this.getImageIcon("/icons/levellow.gif"));
		lowAbstractionMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (iLevelOption!=3){
					iLevelOption=3;
					viewRuleInstances();
				}				
			}
		});
		AbstractionLevelMenu.add(lowAbstractionMenuItem);




		// Report ------------------------------------------
		JMenuItem reportMenuItem= new JMenuItem("Report");
		reportMenuItem.setIcon(this.getImageIcon("/icons/report.gif"));
		reportMenuItem.setBackground(SystemColor.white);
		subMenuBar.add(reportMenuItem);

		// Print -------------------------------------------
		JMenuItem printMenuItem= new JMenuItem("Print");
		printMenuItem.setIcon(this.getImageIcon("/icons/print.gif"));
		printMenuItem.setBackground(SystemColor.white);
		printMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				PrinterJob job = PrinterJob.getPrinterJob();
				//PageFormat format = job.defaultPage();
				job.setPrintable(new Printable() {
					public int print(Graphics pg, PageFormat pf, int pageNum){
						if (pageNum > 0){
							return Printable.NO_SUCH_PAGE;
						}
						Graphics2D g2 = (Graphics2D) pg;
						g2.translate(pf.getImageableX(), pf.getImageableY());

						lhsRhsGraphs.paint(g2);
						return Printable.PAGE_EXISTS;
					}
				});
				if (job.printDialog() == false)
					return;

				try {
					job.print();
				} catch (PrinterException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}


			}
		});


		subMenuBar.add(printMenuItem);

	}



	private void observationList(){

		JPanel ObservationListJPanel = new JPanel(){
			public Dimension getPreferredSize() {
				return new Dimension(320, 0);
			};
		};

		ObservationListJPanel.setLayout(new BorderLayout(0, 0));
		ObservationListJPanel.setBackground(SystemColor.white);

		JLabel labelObservationList = new JLabel("Extracted Rule Instances");
		labelObservationList.setHorizontalAlignment(SwingConstants.CENTER);
		ObservationListJPanel.add(labelObservationList, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		ObservationListJPanel.add(scrollPane, BorderLayout.CENTER);




		this.tableObservation = new JTable();

		/** add event handler*/
		this.tableObservation.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
					selectFromObservationList(tableObservation.rowAtPoint(arg0.getPoint()));					
			}
			
		});
		

		
		

		this.tableObservation.setFillsViewportHeight(true);		
		this.tableObservation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);	
		scrollPane.setViewportView(this.tableObservation);





		// button to refresh or delete observation  			
		JPanel updateDeleteObservationList = new JPanel();
		ObservationListJPanel.add(updateDeleteObservationList, BorderLayout.SOUTH);
		updateDeleteObservationList.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateCleanObservationList(1);
			}
		});
		updateDeleteObservationList.add(btnRefresh);

		JButton btnDeletAll = new JButton("Delete All");
		btnDeletAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateCleanObservationList(3);
			}
		});
		updateDeleteObservationList.add(btnDeletAll);



		// add it in the west
		add(ObservationListJPanel, BorderLayout.WEST);
	}



	private void partialPath(){

		JPanel panelPartialPath = new JPanel();
		panelPartialPath.setBorder(new LineBorder(new Color(189, 183, 107), 1, true));
		panelPartialPath.setBackground(new Color(237, 237, 206));
		panelPartialPath.setLayout(new BorderLayout(0, 0));



		JLabel lblPathTitle = new JLabel("Execution Path");
		lblPathTitle.setHorizontalAlignment(SwingConstants.CENTER);
		//lblnPath.setFont(new Font("Dialog", Font.BOLD, 16));
		panelPartialPath.add(lblPathTitle, BorderLayout.NORTH);



		this.modelListPartialPath =  new DefaultListModel<String>();
		final JList<String> listPartialPath = new JList<String>(this.modelListPartialPath);

		listPartialPath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				selectFromPartialPathList(listPartialPath.getSelectedValue().split(","));				
			}
		});


		listPartialPath.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listPartialPath.setVisibleRowCount(-1);
		listPartialPath.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		

		listPartialPath.setCellRenderer(new PartialPathCellRenderer());


		JScrollPane scrollPanePath = new JScrollPane(){
			public Dimension getPreferredSize() {
				return new Dimension(0, 80);
			};
		};		
		scrollPanePath.setViewportView(listPartialPath);		
		panelPartialPath.add(scrollPanePath, BorderLayout.CENTER);



		// add it in the south
		add(panelPartialPath, BorderLayout.SOUTH);

	}




	private void viewRulePanels (){


		this.textPanesRuleDetails = new JTextPane();
		this.textPanesRuleDetails.setContentType("text/html");


		JPanel rulePanel = new JPanel();				
		rulePanel.setLayout(new BorderLayout(0, 0));



		// add to rule Details
		rulePanel.add(new JScrollPane(textPanesRuleDetails), BorderLayout.NORTH);




		// add pair of graphs
		rulePanel.add(this.lhsRhsGraphs, BorderLayout.CENTER);




		// add it in the centre of the main panel
		add(rulePanel, BorderLayout.CENTER);
	}




	private String getRuleDetailsHtml(
			String methodSignature,
			String passedParameters,
			String ObjectInScope,
			String ObjectInRule,
			String internalStates,
			String effect,
			String exeuationTime,
			String totalObject,
			String noMinRuleObjects,
			String noContexts){


		String strHtml="<html>"
				+ "<head><style type=^text/css^>table {border: 1px solid #669999; border-collapse: collapse;} td {border-top: 1px solid #669999; border-right: 1px solid #669999;}</style></head>"
				+ "<body>";


		strHtml+="<table cellspacing=^0^ cellpadding=^3px^ style=^font-family:Tahoma; font-size:12pt; width:100%; background-color: #FFFFFF;^>";


		strHtml+="<tr><td style=^background-color: #EDEDCE;^>Method Signature</td><td colspan=^7^>"
				+ methodSignature
				+ "</td></tr>";


		if (passedParameters.length()>120){
			passedParameters=passedParameters.substring(0,120)+"...";
		}
		strHtml+="<tr><td style=^background-color: #EDEDCE;^>Passed/Return Parameters</td><td colspan=^7^>"
				+ passedParameters
				+ "</td></tr>";



		strHtml+="<tr><td style=^background-color: #EDEDCE; width: 120px;^>Total Executed Objects</td><td style=^width: 60px;^>"
				+ totalObject				
				+ "</td><td style=^background-color: #EDEDCE; width: 100px;^>Objects in Scope</td><td style=^width: 60px;^>"
				+ ObjectInScope
				+ "</td><td style=^background-color: #EDEDCE; width: 80px;^>Objects in Rule</td><td style=^width: 60px;^>"
				+ ObjectInRule
				+ "</td><td style=^background-color: #EDEDCE; width: 80px;^>Execution in sec.</td><td>"
				+ exeuationTime				
				+ "</td></tr>";	


		strHtml+="<tr><td style=^background-color: #EDEDCE;^>Steps in Internal States</td><td>"
				+ internalStates				
				+ "</td><td style=^background-color: #EDEDCE;^>Objects in min-Rule</td><td>"
				+ noMinRuleObjects
				+ "</td><td style=^background-color: #EDEDCE;^>Contexts</td><td>"
				+ noContexts
				+ "</td><td style=^background-color: #EDEDCE;^>Effect</td>";		


		if (effect.startsWith("t")){
			strHtml+="<td style=^background-color: #CCEBD3^>Yes</td>";
		}
		else if (effect.startsWith("f")){
			strHtml+="<td style=^background-color: #FAFAD7^>No, minimal rule is empty</td>";
		}
		else {
			strHtml+="<td>" + effect + "</td>";
		}


		strHtml+="</table></body></html>";		

		return strHtml.replace("^", "\"");
	}



	
	
	
	
	
	
	
	


	/**	Actions
	 * 
	 * 		1 - fillObservationList()
	 *  	2 - updateCleanObservationList() refresh, select some and delete all from rule instances
	 * 		3 - selectFromObservationList()
	 * 		4 - viewRuleDetails()
	 * 		5 - viewPartialPath()
	 * 		6 - viewRuleInstances()
	 * 		7 - selectFromPartialPathList()
	 */



	private void fillObservationList(){

		/**	"ID", "Main method", "Internal states" */


		// delete all current rows
		this.tableObservation.setModel(new DefaultTableModel(
				new Object[][] {
						//{null, null, null},
				},
				new String[] {
						"Instance", "Operation", "Execution in sec."
				}
				));	
		DefaultTableModel modelTableObservation = (DefaultTableModel) this.tableObservation.getModel();

		// set table styles 
		tableObservation.getColumnModel().getColumn(0).setPreferredWidth(20);
		tableObservation.getColumnModel().getColumn(1).setPreferredWidth(95);
		tableObservation.getColumnModel().getColumn(2).setPreferredWidth(79);


		CachedRowSetImpl crsObservationList = DBRecord.getByQueryStatement("select Observation_ID, MethodName, CAST(timediff(ExecutionTimeTo, ExecutionTimeFrom)AS CHAR) from TblObservationOutput;");		
		try {

			while (crsObservationList.next()){

				int oID = crsObservationList.getInt(1);
				String mainMethod = crsObservationList.getString(2);
				String exePeriod= crsObservationList.getString(3);

				// add new row
				modelTableObservation.addRow(new Object[]{oID, mainMethod, exePeriod});
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}




		// clean up all list view
		this.textPanesRuleDetails.setText(this.getRuleDetailsHtml("---", "---", "---", "---", "---", "---", "---", "---", "---", "---"));
		this.lhsRhsGraphs.LHS.clearGraph();
		this.lhsRhsGraphs.RHS.clearGraph();
		this.modelListPartialPath.removeAllElements();

	}



	private void updateCleanObservationList(int iAction){

		switch (iAction){
		case 1:
			this.fillObservationList();
			break;
		case 2:
			JOptionPane.showMessageDialog(null,
					"Eggs are not supposed to be green." + iAction);


			break;
		case 3:
			DBRecord.removeObservation("");
			this.fillObservationList();
			break;
		default:
			break;

		}

	}



	private void selectFromObservationList(int iRow){

		if (iRow<0){
			return;
		}


		this.iSelectedObservationID = Integer.parseInt(this.tableObservation.getModel().getValueAt(iRow, 0).toString());


		// view rule details
		this.viewRuleDetails();


		// view rule instances
		this.viewRuleInstances();


	}



	private void viewRuleDetails(){


		CachedRowSetImpl crsRuleInstanceDetails = DBRecord.getByQueryStatement(
				"select "
						+ "MethodSignature,"
						+ "RuleParameters,"
						+ "iScopeObjectsCount, "
						+ "objectsCount, "
						+ "internalStateCount, "
						+ "hasEffect, "
						+ "CAST(timediff(ExecutionTimeTo, ExecutionTimeFrom)AS CHAR),"
						+ "iTotalExecutedObject,"
						+ "count(distinct nodeID) as noMinRule,"
						+ "PartialPath "
						+ "from TblObservationOutput INNER JOIN TblBasicRule "
						+ "ON TblObservationOutput.Observation_ID=TblBasicRule.Observation_IDREFF "
						+ "INNER JOIN TblGraph on TblBasicRule.Observation_IDREFF=TblGraph.Observation_IDREFF "
						+ "INNER JOIN TblNode on TblGraph.GraphID=TblNode.Graph_IDREFF "
						+ "where isMinimal=true and Observation_ID=" + this.iSelectedObservationID);

		try {

			if (crsRuleInstanceDetails.next()){	


				this.textPanesRuleDetails.setText(
						this.getRuleDetailsHtml(
								crsRuleInstanceDetails.getString(1), 
								crsRuleInstanceDetails.getString(2), 
								crsRuleInstanceDetails.getInt(3)+"", 
								crsRuleInstanceDetails.getInt(4)+"", 
								crsRuleInstanceDetails.getInt(5)+"", 
								String.valueOf(crsRuleInstanceDetails.getBoolean(6)),
								crsRuleInstanceDetails.getString(7),
								crsRuleInstanceDetails.getInt(8)+"",
								crsRuleInstanceDetails.getInt(9)+"",
								(crsRuleInstanceDetails.getInt(4) - crsRuleInstanceDetails.getInt(9))+""));


				// view path from string 
				this.viewPartialPath(crsRuleInstanceDetails.getString(10));


			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}



	private void viewPartialPath(String pathAsString){

		this.modelListPartialPath.removeAllElements();
		int iIndex=0;
		String[] ppathPoint= pathAsString.split("/");
		for (String getPoint: ppathPoint){

			getPoint=getPoint.trim();
			if (getPoint.length()<1 || getPoint.startsWith("#")){
				continue;
			}

			String strPoint=" [" + (++iIndex) + "] " + getPoint + "==> ";
			this.modelListPartialPath.addElement(strPoint);			
		}		

	}



	private void viewRuleInstances(){

		if (this.iSelectedObservationID<1){
			JOptionPane.showMessageDialog(null,"Please, select rule instance first!");
			return;
		}

		this.lhsRhsGraphs.visualiseGraphs(
				this.iSelectedObservationID, 
				true, 
				this.isViewingMinimalRule, 
				this.iLevelOption,
				false);
	}



	private void selectFromPartialPathList(String[] stateInPath){
		/*

		// remove all element ..
		this.modelSelectedObjectAttributes.removeAllElements();

		String adviceID = stateInPath[2];


		CachedRowSetImpl crsAdviceDetails = DBRecord.getByQueryStatement(
				"select FullDeclarationSignature, ABS(PointcutCategory), ThisObjectID, TargetObjectID "				
				+ " from TblAdvice "
				+ " where Observation_IDREFF=" + this.SelectedObservationID
				+ " and Advice_ID=" + adviceID);		
		try {

			if (crsAdviceDetails.next()){

				int PointcutCategory = crsAdviceDetails.getInt(2);

				this.modelSelectedObjectAttributes.addElement("Signature: " + crsAdviceDetails.getString(1));
				this.modelSelectedObjectAttributes.addElement("Join Point Type: " + strPointcutCategory(PointcutCategory));							

				// check if the object is [thisObjectID]
				String ObjectIdFromScope="";
				if (stateInPath[1].contains(crsAdviceDetails.getString(4))){					
					ObjectIdFromScope=crsAdviceDetails.getString(4);
				}
				else {
					ObjectIdFromScope=crsAdviceDetails.getString(3);					
				}

				this.viewObjectFromScope(ObjectIdFromScope);
				this.setAccessedField(adviceID);

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (this.modelSelectedObjectAttributes.size()==0){
			this.modelSelectedObjectAttributes.addElement("No attributes");
		}
		 */
	}

	private ImageIcon getImageIcon(String ImageIconName){

		java.net.URL imgURL = getClass().getResource(ImageIconName);		
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			return null;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
}

