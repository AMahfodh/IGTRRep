package visualisation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class displayingGTrules {

	private JFrame frmLearningGTrules;

	private InstanceRuleVisualisation instanceRuleVisualisationJPanel=null;
	private GeneralisedRulesVisualisation GeneralisedRulesVisualisationJPanel =null;	

	JMenuItem RuleInstanceMenuItem=null;
	JMenuItem generalisedRuleMenuItem=null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					displayingGTrules window = new displayingGTrules();
					window.frmLearningGTrules.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public displayingGTrules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmLearningGTrules = new JFrame();		

		frmLearningGTrules.setResizable(true);
		frmLearningGTrules.setTitle("Extracting and Learning Visual Contracts");
		frmLearningGTrules.setBounds(100, 100, 1400, 700);
		frmLearningGTrules.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLearningGTrules.setLocationRelativeTo(null);	
		//frmLearningGTrules.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmLearningGTrules.getContentPane().setLayout(new BoxLayout(frmLearningGTrules.getContentPane(), BoxLayout.X_AXIS));		
		// set JMenuBar
		this.setJMenu();

	}




	private void setJMenu(){

		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT)); 
		menuBar.setPreferredSize(new Dimension(0, 30));
		menuBar.setBackground(new Color(212, 208, 200));		
		frmLearningGTrules.setJMenuBar(menuBar);



		// Instances Rules JMenuItems		
		this.RuleInstanceMenuItem = new JMenuItem("Visualis Rule's Instances");
		this.RuleInstanceMenuItem.setIcon(this.getImageIcon("/icons/ruleInstance.gif"));
		this.RuleInstanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				veiwJpanels(1);
			}
		});
		menuBar.add(this.RuleInstanceMenuItem);




		// Generalised Rules JMenuItems		
		this.generalisedRuleMenuItem = new JMenuItem("Visualis Generalised Rules");
		this.generalisedRuleMenuItem.setIcon(this.getImageIcon("/icons/generalisedRule.png"));
		this.generalisedRuleMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				veiwJpanels(2);
			}
		});		
		menuBar.add(this.generalisedRuleMenuItem);

	}




	private void veiwJpanels(int iJPanelForm){


		switch (iJPanelForm){


		// instanceRuleVisualisationJPanel
		case 1:


			if (this.GeneralisedRulesVisualisationJPanel!=null){
				this.GeneralisedRulesVisualisationJPanel.setVisible(false);
			}

			RuleInstanceMenuItem.setBackground(SystemColor.white);
			generalisedRuleMenuItem.setBackground(frmLearningGTrules.getBackground());


			if (this.instanceRuleVisualisationJPanel!=null){
				this.instanceRuleVisualisationJPanel.setVisible(true);
			}
			else 
			{
				this.instanceRuleVisualisationJPanel = new InstanceRuleVisualisation();
				frmLearningGTrules.getContentPane().add(this.instanceRuleVisualisationJPanel);

				frmLearningGTrules.getContentPane().revalidate();
				frmLearningGTrules.getContentPane().validate();
				frmLearningGTrules.getContentPane().repaint();
			}


			break;



			// RuleGeneralizationJPanel
		case 2:

			if (this.instanceRuleVisualisationJPanel!=null){
				this.instanceRuleVisualisationJPanel.setVisible(false);
			}

			RuleInstanceMenuItem.setBackground(frmLearningGTrules.getBackground());
			generalisedRuleMenuItem.setBackground(SystemColor.white);


			if (this.GeneralisedRulesVisualisationJPanel!=null){
				this.GeneralisedRulesVisualisationJPanel.setVisible(true);
			}
			else 
			{
				this.GeneralisedRulesVisualisationJPanel = new GeneralisedRulesVisualisation();
				frmLearningGTrules.getContentPane().add(this.GeneralisedRulesVisualisationJPanel);

				frmLearningGTrules.getContentPane().revalidate();
				frmLearningGTrules.getContentPane().validate();
				frmLearningGTrules.getContentPane().repaint();
			}


			break;			

		default: break;

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
