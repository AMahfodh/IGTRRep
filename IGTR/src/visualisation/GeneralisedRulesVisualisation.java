package visualisation;

import inferences.DBRecord;
import inferences.GNACs;
import inferences.GNACs.NACinstance;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import com.sun.rowset.CachedRowSetImpl;

public class GeneralisedRulesVisualisation extends JPanel {


	private JTree operationTree=null;	
	private JTable tableRuleInstances;
	private jGraphRule NAC= new jGraphRule("NAC");
	private LhsRhs lhsRhsGraphs = new LhsRhs();
	private JComboBox<RuleItem> NACComboBox=null;
	private JPanel NACpanel=null;
	private DecimalFormat df = new DecimalFormat("#.00");
	private double iHighMOAccuracy=5.0;	// default accuracy value  

	// selected options from menu
	private boolean isViewingMinimalRule=false;
	private int iLevelOption=3;



	// inferred decision options
	private JPanel positiveNegativeRulePanel=null;
	private JPanel multiOpjectsPanel =null;
	private JRadioButton radioButtonPositive = null;
	private JRadioButton radioButtonNegative = null;
	private JRadioButton radioButtonCorrectMulti = null;
	private JRadioButton radioButtonIncorrectMulti = null;
	private boolean isBeingUpdated=false;



	// selected rule item
	RuleItem selectedRuleItem =null;
	
	// list of NACs
	GNACs gNACs =null;
	


	public GeneralisedRulesVisualisation() {

		setBorder(new LineBorder(new Color(105, 105, 105), 1, true));
		setLayout(new BorderLayout(0, 0));		
		this.extractedRulesSetting();			
		this.setRuleGraphs();

	}


	private void extractedRulesSetting(){


		// ********************************
		//  main JPanel 
		JPanel panelObservedOperations = new JPanel(){
			public Dimension getPreferredSize() {
				return new Dimension(0, 190);
			};
		};
		panelObservedOperations.setLayout(new BorderLayout());		




		// ********************************
		// operation list and Tree setting

		this.operationTree= new JTree(new DefaultMutableTreeNode("Operations"));		
		operationTree.getSelectionModel().setSelectionMode
		(TreeSelectionModel.SINGLE_TREE_SELECTION);

		operationTree.addTreeSelectionListener(new TreeSelectionListener() {

			public void valueChanged(TreeSelectionEvent arg0) {

				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)
						operationTree.getLastSelectedPathComponent();

				if (selectedNode == null){
					return;
				}

				if (selectedNode.isRoot() && selectedNode.getDepth()==2){

					// update tree
					//fillTreeSetOfOperations();
				}
				else if (selectedNode.isLeaf() && selectedNode.getUserObject() instanceof RuleItem) {					

					selectedRuleItem = (RuleItem)selectedNode.getUserObject();
					viewRuleWithItsTableInstancesAndMultiObject(selectedNode.getParent().toString());

				}

			}
		});


		// set icons in JTree
		DefaultTreeCellRenderer renderer =new DefaultTreeCellRenderer();
		renderer.setLeafIcon(this.getImageIcon("/icons/levelLow.gif"));		
		this.operationTree.setCellRenderer(renderer);


		JScrollPane treeView = new JScrollPane();
		treeView.setViewportView(operationTree);
		treeView.setAutoscrolls(true);		
		treeView.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "Observed operations", TitledBorder.LEADING, TitledBorder.TOP));
		treeView.setBackground(new Color(237, 237, 206));




		// ******************************************
		// rule options and list of instances setting
		JPanel ruleOptionPanel = new JPanel();
		this.setRuleOptionComponents(ruleOptionPanel);


		JScrollPane ruleInstancesscrollPanel= new JScrollPane();
		this.setRuleInstancesPanel(ruleInstancesscrollPanel);

		JPanel ruleOptionAndInstancePanel = new JPanel();		
		ruleOptionAndInstancePanel.setLayout(new BoxLayout(ruleOptionAndInstancePanel, BoxLayout.X_AXIS));		
		ruleOptionAndInstancePanel.add(ruleOptionPanel);
		ruleOptionAndInstancePanel.add(ruleInstancesscrollPanel);




		// *********************************************
		// sub JMenuBar
		JMenuBar subMenuBar= new JMenuBar();
		this.setSubJMenuBar(subMenuBar);




		// **************
		// add components 
		panelObservedOperations.add(subMenuBar, BorderLayout.NORTH);
		panelObservedOperations.add(treeView, BorderLayout.CENTER);		
		panelObservedOperations.add(ruleOptionAndInstancePanel, BorderLayout.EAST);				
		add(panelObservedOperations, BorderLayout.NORTH);



		// ****************************************
		// fill list of operations and their rules 
		this.fillTreeSetOfOperations();

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

					viewGeneralisedRule();
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
					viewGeneralisedRule();
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
					viewGeneralisedRule();
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
					viewGeneralisedRule();
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
					viewGeneralisedRule();
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




	private void setRuleOptionComponents(JPanel ruleOptionPanel){

		ruleOptionPanel.setLayout(new BoxLayout(ruleOptionPanel, BoxLayout.Y_AXIS));
		ruleOptionPanel.setPreferredSize(new Dimension(200, 0));	


		// Inferred Rule Applicability		
		this.positiveNegativeRulePanel = new JPanel();
		this.positiveNegativeRulePanel.setLayout(new FlowLayout());
		this.positiveNegativeRulePanel.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "Rule's Applicability", TitledBorder.LEADING, TitledBorder.TOP));
		this.positiveNegativeRulePanel.setBackground(new Color(237, 237, 206));

		this.radioButtonPositive = new JRadioButton("Positive");
		this.radioButtonNegative = new JRadioButton("Negative");


		this.radioButtonPositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				isBeingUpdated=true;
				positiveNegativeRulePanel.setBackground(new Color(237, 237, 206));
			}
		});
		this.radioButtonNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				isBeingUpdated=true;
				positiveNegativeRulePanel.setBackground(new Color(232, 179, 179));
			}
		});


		this.radioButtonPositive.setForeground(new Color(2, 107, 2));
		this.radioButtonPositive.setBackground(new Color(237, 237, 206));
		this.radioButtonNegative.setForeground(new Color(128, 0, 0));
		this.radioButtonNegative.setBackground(new Color(237, 237, 206));

		this.positiveNegativeRulePanel.add(radioButtonPositive);
		this.positiveNegativeRulePanel.add(radioButtonNegative);
		ButtonGroup groupRuleType = new ButtonGroup();
		groupRuleType.add(radioButtonPositive);
		groupRuleType.add(radioButtonNegative);




		// Inferred Existence of multi-object
		this.multiOpjectsPanel = new JPanel();
		this.multiOpjectsPanel.setLayout(new FlowLayout());
		this.multiOpjectsPanel.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "Inferred Multi-Objects", TitledBorder.LEADING, TitledBorder.TOP));
		this.multiOpjectsPanel.setBackground(new Color(237, 237, 206));

		this.radioButtonCorrectMulti = new JRadioButton("Correct");
		this.radioButtonIncorrectMulti = new JRadioButton("Incorrect");


		this.radioButtonCorrectMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				isBeingUpdated=true;
				multiOpjectsPanel.setBackground(new Color(237, 237, 206));
			}
		});
		this.radioButtonIncorrectMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				isBeingUpdated=true;
				multiOpjectsPanel.setBackground(new Color(232, 179, 179));
			}
		});


		this.radioButtonCorrectMulti.setForeground(new Color(2, 107, 2));
		this.radioButtonCorrectMulti.setBackground(new Color(237, 237, 206));
		this.radioButtonIncorrectMulti.setForeground(new Color(128, 0, 0));
		this.radioButtonIncorrectMulti.setBackground(new Color(237, 237, 206));


		this.multiOpjectsPanel.add(this.radioButtonCorrectMulti);
		this.multiOpjectsPanel.add(this.radioButtonIncorrectMulti);
		ButtonGroup groupmultiOpjects = new ButtonGroup();
		groupmultiOpjects.add(this.radioButtonCorrectMulti);
		groupmultiOpjects.add(this.radioButtonIncorrectMulti);
		this.setEnabledAll(this.multiOpjectsPanel, false);





		// user interactions : update decision or delete rule with all its instances

		JPanel userInputPanel = new JPanel();
		userInputPanel.setLayout(new FlowLayout());
		userInputPanel.setBackground(new Color(237, 237, 206));

		JButton btnUpdateAndRefresh = new JButton("Refresh - Commit");

		btnUpdateAndRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// calling Refresh/Commit method
				refreshCommitRuleDecision();

			}
		});
		userInputPanel.add(btnUpdateAndRefresh);












		// ******************************************
		// add components
		ruleOptionPanel.add(positiveNegativeRulePanel);
		ruleOptionPanel.add(multiOpjectsPanel);
		ruleOptionPanel.add(userInputPanel);


	}



	private void setRuleInstancesPanel(JScrollPane ruleInstancesscrollPanel){

		ruleInstancesscrollPanel.setAutoscrolls(true);
		ruleInstancesscrollPanel.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "Rule's Instances", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		ruleInstancesscrollPanel.setBackground(new Color(237, 237, 206));



		this.tableRuleInstances = new JTable();
		this.tableRuleInstances.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Object gSelectedRow = tableRuleInstances.getValueAt(tableRuleInstances.getSelectedRow(), 0);

				if (gSelectedRow !=null){
					viewRuleFromInstanceTable(gSelectedRow.toString());
				}
			}
		});
		this.tableRuleInstances.setModel(new DefaultTableModel(
				new Object[][] {
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
				},
				new String[] {
						"Instance id", "No. objects", "No. internal states"
				}
				));
		this.tableRuleInstances.getTableHeader().setBackground(new Color(222, 222, 193));
		this.tableRuleInstances.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		ruleInstancesscrollPanel.setViewportView(this.tableRuleInstances);

	}






	private void setRuleGraphs(){

		JSplitPane splitMainPanelWithNACGraph = new JSplitPane();		
		splitMainPanelWithNACGraph.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "Generalised Rule", TitledBorder.CENTER, TitledBorder.TOP));
		splitMainPanelWithNACGraph.setBackground(new Color(237, 237, 206));

		splitMainPanelWithNACGraph.setResizeWeight(0.22); 
		splitMainPanelWithNACGraph.setOneTouchExpandable(true);
		splitMainPanelWithNACGraph.setContinuousLayout(true);




		// -----------------------------------------
		NACpanel = new JPanel();
		NACpanel.setLayout(new BorderLayout(0, 0));




		//NAC combo box
		RuleItem[] nacRuleItem = {new RuleItem("--- Select NAC instance ---")};
		this.NACComboBox = new JComboBox<RuleItem>(nacRuleItem);
		this.NACComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				if (arg0.getStateChange() == ItemEvent.SELECTED
						&& NACComboBox.getSelectedIndex()>0) {
					viewSelectedNAC();
				}
			}
		});


		NACpanel.add(this.NACComboBox, BorderLayout.NORTH);
		NACpanel.add(this.NAC, BorderLayout.CENTER);
		this.setEnabledAll(NACpanel, false);


		splitMainPanelWithNACGraph.setLeftComponent(NACpanel);		
		splitMainPanelWithNACGraph.setRightComponent(this.lhsRhsGraphs);


		// add three graphs into centre of the main panel
		add(splitMainPanelWithNACGraph, BorderLayout.CENTER);

	}


	private void setEnabledAll(Object object, boolean state) {
		if (object instanceof Container) {
			Container c = (Container)object;
			Component[] components = c.getComponents();
			for (Component component : components) {
				setEnabledAll(component, state);
				component.setEnabled(state);
			}
		}
		else {
			if (object instanceof Component) {
				Component component = (Component)object;
				component.setEnabled(state);
			}
		}
	}












	// *****************************************************
	// ************* Filling data  *************************
	// *****************************************************


	// fill tree by set of operations
	private void fillTreeSetOfOperations(){



		DefaultMutableTreeNode operationModelNodes = (DefaultMutableTreeNode)this.operationTree.getModel().getRoot();
		operationModelNodes.removeAllChildren();

		DefaultMutableTreeNode opNodeName=null;
		String opSignatureUniqueID="*";

		CachedRowSetImpl crsOperationList = DBRecord.getByQueryStatement(
				"select MethodSignatureUniqueID, RuleName, MethodSignature, Observation_IDREFF, groupID "
						+ "from TblBasicRule inner join TblObservationOutput on TblObservationOutput.Observation_ID = TblBasicRule.Observation_IDREFF "
						+ "where isApplicable=true and isAbstract=true group by CONCAT(RuleName, groupID) order by MethodSignatureUniqueID, hasEffect DESC, groupID;");

		try {

			while (crsOperationList.next()){

				if (!opSignatureUniqueID.equals(crsOperationList.getString(1))){
					opSignatureUniqueID= crsOperationList.getString(1);
					opNodeName = new DefaultMutableTreeNode(crsOperationList.getString(2) + " [ " + crsOperationList.getString(3) + " ] ");
					operationModelNodes.add(opNodeName);



					// add multi-Object
					CachedRowSetImpl crsMultiObjectList = DBRecord.getByQueryStatement(
							"select RuleName, Observation_IDREFF from TblBasicRule "
									+ "where isAbstract=true and isAbstractMO=true "
									+ "and MethodSignatureUniqueID='" + opSignatureUniqueID + "' order by objectsCount;");

					while (crsMultiObjectList.next()){
						DefaultMutableTreeNode opMultiObjectRuleNodeName = new DefaultMutableTreeNode(
								new RuleItem(
										crsMultiObjectList.getString(1),
										crsMultiObjectList.getInt(2), 
										0,
										true,
										false) 
								);								
						opNodeName.add(opMultiObjectRuleNodeName);	
					}


				}


				DefaultMutableTreeNode opRuleNodeName = new DefaultMutableTreeNode(
						new RuleItem(
								crsOperationList.getString(2),
								crsOperationList.getInt(4),
								crsOperationList.getInt(5), 
								false));

				opNodeName.add(opRuleNodeName);				
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}	



		// expanding all rule-nodes  		
		this.operationTree.expandPath(new TreePath(operationModelNodes.getPath()));		
		this.operationTree.updateUI();
	}



	private void viewRuleWithItsTableInstancesAndMultiObject( 
			String ruleNameWithParameters){


		// ******************
		// inferred decision
		this.isBeingUpdated=false;





		// Repaint general rule title
		boolean isContainedReturn = !ruleNameWithParameters.toLowerCase().contains("void");
		int iParCount = ruleNameWithParameters.split(",").length;


		ruleNameWithParameters="";
		for (int i=1; i<=iParCount; i++){
			ruleNameWithParameters +=",  par" + i; 
		}
		if (ruleNameWithParameters.length()!=0){
			ruleNameWithParameters = " ( " + ruleNameWithParameters.substring(3) + " ) ";
		}

		if (isContainedReturn){
			ruleNameWithParameters = "Generalised Rule  ===>         " + "return = " + this.selectedRuleItem.ruleName +  ruleNameWithParameters;
		}
		else {
			ruleNameWithParameters = "Generalised Rule  ===>         " + this.selectedRuleItem.ruleName +  ruleNameWithParameters;
		}


		JSplitPane splitMainPanelWithNACGraph = (JSplitPane)this.lhsRhsGraphs.getParent();		
		splitMainPanelWithNACGraph.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), ruleNameWithParameters , TitledBorder.CENTER, TitledBorder.TOP));






		int groupID=-4;
		boolean isApplicable=false;
		String MethodSignatureUniqueID="";

		CachedRowSetImpl crsRuleInstances = DBRecord.getByQueryStatement("select groupID, isApplicable, MethodSignatureUniqueID from TblBasicRule where Observation_IDREFF=" + this.selectedRuleItem.observation_Graph_ID);


		try {

			if (!crsRuleInstances.next()){
				return;
			}

			groupID=crsRuleInstances.getInt(1);
			isApplicable = crsRuleInstances.getBoolean(2);
			MethodSignatureUniqueID= crsRuleInstances.getString(3);

		} catch (SQLException e) {
			e.printStackTrace();
		}



		// rule is applicable (positive)
		if (isApplicable){

			this.radioButtonPositive.setSelected(true);
			this.radioButtonNegative.setSelected(false);
			this.positiveNegativeRulePanel.setBackground(new Color(237, 237, 206));
		}
		else {			
			this.radioButtonPositive.setSelected(false);
			this.radioButtonNegative.setSelected(true);
			this.positiveNegativeRulePanel.setBackground(new Color(232, 179, 179));			
		}






		// view set NACs
		this.fillListOfNAC(isApplicable, MethodSignatureUniqueID);




		// view rule
		this.viewGeneralisedRule();






		if (this.selectedRuleItem.isRuleWithMultiObject){

			// rule multi-object components are true by default				
			this.radioButtonCorrectMulti.setSelected(true);
			this.radioButtonIncorrectMulti.setSelected(false);	
			this.setEnabledAll(this.multiOpjectsPanel, true);
			this.multiOpjectsPanel.setBackground(new Color(237, 237, 206));


			// fill rule with Multi instance table
			this.tableRuleInstances.setModel(new DefaultTableModel(
					new Object[][] {
							{null, null, null}
					},
					new String[] {
							"Maximal Rule id", "No. objects", "No. multi-objects"
					}
					));
			DefaultTableModel modelTableRuleInstances = (DefaultTableModel) this.tableRuleInstances.getModel();


			crsRuleInstances = DBRecord.getByQueryStatement(
					"select Observation_IDREFF, objectsCount, count(isMulti)"
							+ " from TblBasicRule inner join TblRuleMoNodes "
							+ " ON Observation_IDREFF = ruleMo_IDREFF"
							+ " where hasMultiObject=true and isMulti=true"
							+ " and MethodSignatureUniqueID='" + MethodSignatureUniqueID + "' "
							+ " and groupID_MO=(select groupID_MO from TblBasicRule "
							+ "		where Observation_IDREFF="+ this.selectedRuleItem.observation_Graph_ID + ")"
							+ " and groupID_MO is not null "
							+ " group by Observation_IDREFF order by objectsCount;");

			modelTableRuleInstances.setRowCount(0);
			try {

				while (crsRuleInstances.next()){

					int iRuleWithMO_ObservationID = crsRuleInstances.getInt(1);
					int iActualNoObjects = crsRuleInstances.getInt(2);
					int iCurrentNoObjects= crsRuleInstances.getInt(3);

					// add new row
					modelTableRuleInstances.addRow(new Object[]{iRuleWithMO_ObservationID, iActualNoObjects, iCurrentNoObjects});
				}


			} catch (SQLException e) {
				e.printStackTrace();
			}



			// to update border title in table instance panel
			this.updateTableRuleInstanceTitle(false);



			// break to not perfoming the following code which is for normal generalisation only
			return;
		}




		// rule multi-object is correct
		this.setEnabledAll(this.multiOpjectsPanel, false);			
		this.radioButtonCorrectMulti.setSelected(false);
		this.radioButtonIncorrectMulti.setSelected(false);		
		this.multiOpjectsPanel.setBackground(new Color(237, 237, 206));




		// to update border title in table instance panel
		this.updateTableRuleInstanceTitle(true);



		// fill rule instance table
		this.tableRuleInstances.setModel(new DefaultTableModel(
				new Object[][] {
						{null, null, null}
				},
				new String[] {
						"Instance id", "No. objects", "No. internal states"
				}
				));
		DefaultTableModel modelTableRuleInstances = (DefaultTableModel) this.tableRuleInstances.getModel();
		crsRuleInstances = DBRecord.getByQueryStatement("select Observation_IDREFF, objectsCount, internalStateCount from TblBasicRule where groupID=" + groupID + " and MethodSignatureUniqueID='" + MethodSignatureUniqueID + "' order by isAbstract;");
		modelTableRuleInstances.setRowCount(0);
		try {

			while (crsRuleInstances.next()){

				int iRuleInstanceObservationID = crsRuleInstances.getInt(1);
				int iNoObjects = crsRuleInstances.getInt(2);
				int iNoStates= crsRuleInstances.getInt(3);

				// add new row
				modelTableRuleInstances.addRow(new Object[]{iRuleInstanceObservationID, iNoObjects, iNoStates});
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}



	}




	private void updateTableRuleInstanceTitle(boolean isRuleInstance){

		JScrollPane ruleInstancesscrollPanel = (JScrollPane)this.tableRuleInstances.getParent().getParent();
		if (isRuleInstance){
			ruleInstancesscrollPanel.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "Rule's Instances", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		}
		else {
			// defaul occurcy is 5
			double accuracy = (this.tableRuleInstances.getRowCount()/this.iHighMOAccuracy)*100;
			String ruleAccuracyTitle="Rules with multi-objects  [ current accuracy : " + df.format(accuracy) + " %  ] ";
			ruleInstancesscrollPanel.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), ruleAccuracyTitle, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		}		
	}




	private void fillListOfNAC(boolean isApplicable, String MethodSignatureUniqueID){

		this.NAC.clearGraph();
		this.NACComboBox.removeAllItems();
		this.NACComboBox.addItem(new RuleItem("--- Select NAC instance ---"));

		if (!isApplicable){					
			this.setEnabledAll(NACpanel, false);
			return;
		}

		this.setEnabledAll(NACpanel, true);


		// fill NACs
		this.gNACs = new GNACs(this.selectedRuleItem.observation_Graph_ID);
		
		// add NAC list
		int iNAC=1;
		
		for (NACinstance nacInstance: this.gNACs.NACs){
			
			this.NACComboBox.addItem(
					new RuleItem(
							"NAC " + (iNAC++), 
							nacInstance.getNACGraphID(),
							-2,
							false));
		}
		
		
		
		/*
		CachedRowSetImpl crsNACs = DBRecord.getByQueryStatement(""
				+ "select TblGraph.GraphID "
				+ "from TblBasicRule INNER JOIN TblGraph "
				+ "on TblBasicRule.Observation_IDREFF=TblGraph.Observation_IDREFF "
				+ "where TblBasicRule.isAbstract=true "
				+ "and TblBasicRule.isApplicable=false "
				+ "and TblGraph.graphType=false "
				+ "and TblBasicRule.MethodSignatureUniqueID='" + MethodSignatureUniqueID + "';");

		try {

			int iNAC=1;
			while (crsNACs.next()){

				int iNACObservationID = crsNACs.getInt(1);

				// add new row
				this.NACComboBox.addItem(
						new RuleItem(
								"NAC " + (iNAC++), 
								iNACObservationID,
								-2,
								false));
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		
		// to view the first NAC
		if (this.NACComboBox.getItemCount()>1){
			this.NACComboBox.setSelectedIndex(1);
		}

	}


	private void viewSelectedNAC(){

		// view selected NAC from compoBox as well as from first selection	
		RuleItem selectedRuleItem = (RuleItem)this.NACComboBox.getSelectedItem();

		this.NAC.visualiseGraph(
				selectedRuleItem.observation_Graph_ID, 
				false, 
				false,
				false,
				this.isViewingMinimalRule, 
				this.iLevelOption);
	}



	private void viewGeneralisedRule(){

		if (this.selectedRuleItem==null){
			JOptionPane.showMessageDialog(null,"Select rule first!");
			return;
		}

		this.lhsRhsGraphs.visualiseGraphs(
				this.selectedRuleItem.observation_Graph_ID, 
				false, 
				this.isViewingMinimalRule, 
				this.iLevelOption,
				this.selectedRuleItem.isRuleWithMultiObject);

	}




	private void viewRuleFromInstanceTable(String instanceObservationID){

		LhsRhs viewPopupRuleInstance = new LhsRhs();
		int iObservation= Integer.parseInt(instanceObservationID);
		String strRuleTitle= null;


		if (this.selectedRuleItem.isRuleWithMultiObject){
			strRuleTitle="Visualising Rule with multi-objects : ";
			viewPopupRuleInstance.visualiseGraphs(
					iObservation, 
					false, 
					this.isViewingMinimalRule, 
					this.iLevelOption,
					true);
		}
		else {

			strRuleTitle="Visualising Rule Instance : ";
			viewPopupRuleInstance.visualiseGraphs(
					iObservation, 
					true, 
					this.isViewingMinimalRule, 
					this.iLevelOption,
					false);
		}



		// create pop window

		JFrame ruleInstanceModalWindow = new JFrame();
		ruleInstanceModalWindow.setTitle(strRuleTitle + viewPopupRuleInstance.getRuleNameWithParameters(iObservation));
		ruleInstanceModalWindow.setBounds(0, 0, 1070, 400);
		ruleInstanceModalWindow.setLocationRelativeTo(null);
		ruleInstanceModalWindow.setAlwaysOnTop (true);
		ruleInstanceModalWindow.setFocusable(true);
		ruleInstanceModalWindow.setFocusableWindowState(true);
		ruleInstanceModalWindow.setResizable(true);
		ruleInstanceModalWindow.add(viewPopupRuleInstance);		
		ruleInstanceModalWindow.setVisible(true);

	}



	private void refreshCommitRuleDecision(){



		if (this.isBeingUpdated){
			// check the update
			// is enghoupObservation_IDREFF

		}



		// update tree 
		this.fillTreeSetOfOperations();

		JSplitPane splitMainPanelWithNACGraph = (JSplitPane)this.lhsRhsGraphs.getParent();		
		splitMainPanelWithNACGraph.setBorder(new TitledBorder(new LineBorder(new Color(178, 178, 154), 1, true), "" , TitledBorder.CENTER, TitledBorder.TOP));

		this.lhsRhsGraphs.LHS.clearGraph();
		this.lhsRhsGraphs.RHS.clearGraph();
		this.NAC.clearGraph();
	}












	private class RuleItem {

		public String ruleName;
		public int observation_Graph_ID;
		public int iGroupID;        
		public boolean isRuleWithMultiObject=false;      


		public RuleItem(String strRuleName){
			this(strRuleName, -1, -1, false, false);
		}

		public RuleItem(
				String strRuleName, 
				int strObservationID,
				int IGroupID,
				boolean IsRuleWithMultiObject) {

			this(strRuleName, strObservationID, IGroupID, IsRuleWithMultiObject, false);
		}

		public RuleItem(
				String strRuleName, 
				int strObservationID,
				int IGroupID,
				boolean IsRuleWithMultiObject,
				boolean IscombinedOrIndividualMultiObject) {

			this.ruleName = strRuleName;            
			this.observation_Graph_ID = strObservationID;
			this.iGroupID=IGroupID;
			this.isRuleWithMultiObject=IsRuleWithMultiObject;
		}

		public String toString() {


			if (observation_Graph_ID==-1){
				return this.ruleName;
			}


			// for NAC title
			if (iGroupID==-2){        		
				return this.ruleName + " : graph id " + this.observation_Graph_ID;
			}


			// normal generalisation
			if (!this.isRuleWithMultiObject){
				return "Maximal Rule " + this.iGroupID + " : observationID " + this.observation_Graph_ID;
			}


			// multi-object
			else {
				return "Rule with multi-object inferred from " + this.ruleName + " oid= " + this.observation_Graph_ID;
			}
		}
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
