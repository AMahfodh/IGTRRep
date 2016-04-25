package visualisation;

import inferences.DBRecord;
import inferences.GAttribute;
import inferences.GEdge;
import inferences.GNACs;
import inferences.GNACs.NACinstance;
import inferences.GNode;
import inferences.GraphT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.html.HTMLDocument;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxCompactTreeLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.util.mxMorphing;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import com.sun.rowset.CachedRowSetImpl;


public class jGraphRule extends JPanel  {

	private JPanel JPanelContainer =null;
	private mxGraphComponent graphComponent=null;
	private Container previousContentPane;
	private boolean fullScreen = false;

	private String strGraphTitle="";
	private int iGraphID=-1;
	private boolean isInstance;
	private boolean isMultiObject=false;
	private boolean isRHS_Post;
	private boolean isViewingMinimalRule;
	private int ilevelOption;


	private boolean isTreeLayout=false;
	private boolean enableEditing=true;	
	private JMenuItem attMenuItem=null;

	private ArrayList<String> attributeConstraints=null;
	private NACinstance nacRule=null;


	public jGraphRule(String graphTitle){


		// setting title
		this.strGraphTitle=graphTitle;




		// setting of the main jGraph panel 
		this.JPanelContainer = new JPanel();
		this.JPanelContainer.setLayout(new BorderLayout(0, 0));
		this.JPanelContainer.setBorder(new TitledBorder(new LineBorder(new Color(189, 183, 107), 1, true), this.strGraphTitle, TitledBorder.CENTER, TitledBorder.TOP));
		this.JPanelContainer.setBackground(SystemColor.white);		




		// graph menu and options
		JMenuBar graphBottonMenuBar = new JMenuBar(); 
		this.setGraphMenu(graphBottonMenuBar);
		this.JPanelContainer.add(graphBottonMenuBar, BorderLayout.SOUTH);





		// add mxGraph component
		this.graphComponent = new mxGraphComponent(new mxGraph());
		this.setGraphComponentStyleAndEvents();
		this.JPanelContainer.add(this.graphComponent, BorderLayout.CENTER);






		// configure this JPanel component
		setLayout(new BorderLayout(0, 0));
		add(this.JPanelContainer, BorderLayout.CENTER);
		

	}


	private void setGraphMenu(JMenuBar graphBottonMenuBar){


		graphBottonMenuBar.setBackground(new Color(237, 237, 206));	
		graphBottonMenuBar.setLayout(new FlowLayout(FlowLayout.LEFT));

		// Export----------------------------------------
		JMenu exportMenu= new JMenu("Export");
		exportMenu.setIcon(this.getImageIcon("/icons/export.gif"));
		graphBottonMenuBar.add(exportMenu);

		// Image
		JMenuItem ImageMenuItem= new JMenuItem("Image)");
		ImageMenuItem.setIcon(this.getImageIcon("/icons/image.gif"));
		ImageMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (iGraphID!=-1){
					saveAsImage();
				}								
			}
		});
		exportMenu.add(ImageMenuItem);

		// GXL format
		JMenuItem GXLItem= new JMenuItem("GXL format)");
		GXLItem.setIcon(this.getImageIcon("/icons/gxl.gif"));
		exportMenu.add(GXLItem);

		// .DOT format
		JMenuItem DOTMenuItem= new JMenuItem("DOT format)");
		DOTMenuItem.setIcon(this.getImageIcon("/icons/dot.gif"));
		DOTMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exportDOT();
			}
		});
		exportMenu.add(DOTMenuItem);

		/*
		// .OCL format
		JMenuItem OCLMenuItem= new JMenuItem("OCL format)");
		OCLMenuItem.setIcon(this.getImageIcon("/icons/ocl.gif"));
		exportMenu.add(OCLMenuItem);
		 */


		// layout----------------------------------------
		JMenu layoutMenu= new JMenu("Layout");
		layoutMenu.setIcon(this.getImageIcon("/icons/levelMid.gif"));
		graphBottonMenuBar.add(layoutMenu);

		// Tree layout
		JMenuItem treeLayoutMenuItem= new JMenuItem("Tree layout");
		treeLayoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (isTreeLayout){
					return;
				}

				isTreeLayout=true;				
				visualiseGraph();				
			}
		});
		treeLayoutMenuItem.setIcon(this.getImageIcon("/icons/tree.gif"));
		layoutMenu.add(treeLayoutMenuItem);

		// Circle layout
		JMenuItem circleLayoutMenuItem= new JMenuItem("Circle layout");
		circleLayoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!isTreeLayout){
					return;
				}

				isTreeLayout=false;
				visualiseGraph();
			}
		});
		circleLayoutMenuItem.setIcon(this.getImageIcon("/icons/Circle.gif"));
		layoutMenu.add(circleLayoutMenuItem);


		// Editing
		JMenuItem editMenuItem= new JMenuItem("Edit");
		editMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				enableEditing=!enableEditing;
				visualiseGraph();
			}
		});
		editMenuItem.setIcon(this.getImageIcon("/icons/edit.gif"));
		layoutMenu.add(editMenuItem);




		// Constraint on attributes
		this.attMenuItem= new JMenuItem("Constraints");
		this.attMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				viewInvariantsFromSide();
			}
		});
		this.attMenuItem.setIcon(this.getImageIcon("/icons/attConditions.gif"));
		this.attMenuItem.setBackground(new Color(237, 237, 206));
		this.attMenuItem.setVisible(false);
		graphBottonMenuBar.add(this.attMenuItem);




		// Zoom
		JMenuItem zoomMenuItem= new JMenuItem("Zoom");
		zoomMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!fullScreen) {
					doFullScreen();
				} else {
					undoFullScreen();
				}	
			}
		});
		zoomMenuItem.setIcon(this.getImageIcon("/icons/zoom.gif"));
		zoomMenuItem.setBackground(new Color(237, 237, 206));	
		graphBottonMenuBar.add(zoomMenuItem);





	}


	private void saveAsImage(){

		JFileChooser fc = new JFileChooser();
		fc.setSelectedFile(new File(this.strGraphTitle + "_" + this.iGraphID));
		fc.addChoosableFileFilter(new FileNameExtensionFilter("PNG Image", "png"));
		fc.setAcceptAllFileFilterUsed(false);


		if (fc.showSaveDialog(this.JPanelContainer) == JFileChooser.APPROVE_OPTION) {

			BufferedImage bIimage = mxCellRenderer.createBufferedImage(this.graphComponent.getGraph(), null, 1, Color.WHITE, true, null);

			if (bIimage!=null){

				try {            		
					ImageIO.write(bIimage, "PNG", new File(fc.getSelectedFile().getPath() + ".png"));         			
				} 
				catch (IOException e) {

					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}	
		} 


	}


	private void exportDOT(){
		//
	}



	
	
	


	private void doFullScreen() {

		Window w = SwingUtilities.windowForComponent(this.JPanelContainer);
		if (w instanceof JFrame) {
			JFrame frame = (JFrame) w;
			frame.dispose();
			frame.setUndecorated(true);
			frame.getGraphicsConfiguration().getDevice().setFullScreenWindow(w);
			this.previousContentPane = frame.getContentPane();
			frame.setContentPane(this.JPanelContainer);
			frame.revalidate();
			frame.repaint();
			frame.setVisible(true);
			fullScreen = true;
		}

	}

	private void undoFullScreen() {

		Window w = SwingUtilities.windowForComponent(this.JPanelContainer);

		if (w instanceof JFrame) {
			JFrame frame = (JFrame) w;
			frame.dispose();
			frame.setUndecorated(false);
			frame.getGraphicsConfiguration().getDevice().setFullScreenWindow(null);
			frame.setContentPane(previousContentPane);
			add(this.JPanelContainer);

			frame.revalidate();
			frame.repaint();
			frame.setVisible(true);
			fullScreen = false;
		}

	}


	private void setGraphComponentStyleAndEvents(){

		this.graphComponent.setAutoExtend(true);
		this.graphComponent.setAutoScroll(true);
		this.graphComponent.setLocation(0, 0);
		this.graphComponent.getViewport().setBackground(Color.white);


		this.graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
		{		
			public void mouseReleased(MouseEvent e)
			{
				Object cell = graphComponent.getCellAt(e.getX(), e.getY());

				if (cell != null)
				{
					
					// close full screen first 					
					if (fullScreen) {
						undoFullScreen();
					}					
					
					viewSelectedNodeFromGraph(graphComponent.getGraph().getLabel(cell));					
				}
			}
		});

		// define right click on cells
		//
		//
	}



	private void vertexStyle(mxGraph getGraph, boolean isPre ){

		mxStylesheet stylesheet = getGraph.getStylesheet();


		//	String strIsMultiObject = String.valueOf(this.isMultiObject);		

		//-------------------------------------------------------rMinimalStyle.put(mxConstants.STYLE_SHADOW, strIsMultiObject);


		// styles for normal rules 
		this.vertexNormalGraphStyle(stylesheet, isPre);


		// styles for multi object rules
		if (this.isMultiObject){
			this.vertexMultiGraphStyle(stylesheet, isPre);
		}




		/**	style for the minimal edge 	*/
		Hashtable<String, Object> edgeMinimalStyle = new Hashtable<String, Object>();		
		edgeMinimalStyle.put(mxConstants.STYLE_STROKECOLOR, "#783745");
		edgeMinimalStyle.put(mxConstants.STYLE_DASHED, "1");
		edgeMinimalStyle.put(mxConstants.STYLE_STROKEWIDTH, "1.5");
		stylesheet.putCellStyle("EdgeMinimalStyle", edgeMinimalStyle);

	}


	private void vertexNormalGraphStyle(mxStylesheet stylesheet, boolean isPre ){

		// styles for normal rules

		if (isPre){

			/**	style for the Left minimal node deleted nodes (currently not reached)	*/		
			Hashtable<String, Object> lMinimalstyle = new Hashtable<String, Object>();
			lMinimalstyle.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
			lMinimalstyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			lMinimalstyle.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
			lMinimalstyle.put(mxConstants.STYLE_FILLCOLOR, "#FF8989");
			stylesheet.putCellStyle("MinimalStyle", lMinimalstyle);			
		}
		else {

			/**	style for the Right minimal node  created nodes	*/
			Hashtable<String, Object> rMinimalStyle = new Hashtable<String, Object>();
			rMinimalStyle.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
			rMinimalStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			rMinimalStyle.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
			rMinimalStyle.put(mxConstants.STYLE_FILLCOLOR, "#C4FFC9");			
			stylesheet.putCellStyle("MinimalStyle", rMinimalStyle);

			/**	style for the Right minimal node created nodes in (parameters nodes)	*/
			Hashtable<String, Object> rMinimalStyleIsPar = new Hashtable<String, Object>();
			rMinimalStyleIsPar.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
			rMinimalStyleIsPar.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			rMinimalStyleIsPar.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
			rMinimalStyleIsPar.put(mxConstants.STYLE_FONTCOLOR, "#216123");
			rMinimalStyleIsPar.put(mxConstants.STYLE_FILLCOLOR, "#C4FFC9");
			stylesheet.putCellStyle("MinimalStyleIsPar", rMinimalStyleIsPar);
		}





		/**	style for the update minimal node 	*/
		Hashtable<String, Object> lrMinimalStyle = new Hashtable<String, Object>();
		lrMinimalStyle.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		lrMinimalStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		lrMinimalStyle.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		lrMinimalStyle.put(mxConstants.STYLE_FILLCOLOR, "#F9FFC4");	
		stylesheet.putCellStyle("LRMinimalStyle", lrMinimalStyle);


		/**	style for the update minimal node in (this Object node)	*/
		Hashtable<String, Object> lrMinimalStyleIsThis = new Hashtable<String, Object>();
		lrMinimalStyleIsThis.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		lrMinimalStyleIsThis.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		lrMinimalStyleIsThis.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);

		lrMinimalStyleIsThis.put(mxConstants.STYLE_STROKEWIDTH, "1.5");
		lrMinimalStyleIsThis.put(mxConstants.STYLE_DASHED, "1");

		lrMinimalStyleIsThis.put(mxConstants.STYLE_FILLCOLOR, "#F9FFC4");
		stylesheet.putCellStyle("LRMinimalStyleIsThis", lrMinimalStyleIsThis);


		/**	style for the update minimal node in (parameters nodes)	*/
		Hashtable<String, Object> lrMinimalStyleIsPar = new Hashtable<String, Object>();
		lrMinimalStyleIsPar.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		lrMinimalStyleIsPar.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		lrMinimalStyleIsPar.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		lrMinimalStyleIsPar.put(mxConstants.STYLE_FONTCOLOR, "#216123");
		lrMinimalStyleIsPar.put(mxConstants.STYLE_FILLCOLOR, "#F9FFC4");
		stylesheet.putCellStyle("LRMinimalStyleIsPar", lrMinimalStyleIsPar);







		/**	style for the required context node 	*/
		Hashtable<String, Object> requiredStyle = new Hashtable<String, Object>();
		requiredStyle.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		requiredStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		requiredStyle.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		requiredStyle.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
		stylesheet.putCellStyle("RequiredStyle", requiredStyle);		


		/**	style for the required context node in (this Object node)	*/
		Hashtable<String, Object> requiredStyleIsThis = new Hashtable<String, Object>();
		requiredStyleIsThis.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		requiredStyleIsThis.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		requiredStyleIsThis.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);

		requiredStyleIsThis.put(mxConstants.STYLE_STROKEWIDTH, "1.5");
		requiredStyleIsThis.put(mxConstants.STYLE_DASHED, "1");

		requiredStyleIsThis.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
		stylesheet.putCellStyle("RequiredStyleIsThis", requiredStyleIsThis);


		/**	style for the required context node in (parameters nodes)	*/
		Hashtable<String, Object> requiredStyleIsPar = new Hashtable<String, Object>();
		requiredStyleIsPar.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		requiredStyleIsPar.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		requiredStyleIsPar.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		requiredStyleIsPar.put(mxConstants.STYLE_FONTCOLOR, "#216123");
		requiredStyleIsPar.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
		stylesheet.putCellStyle("RequiredStyleIsPar", requiredStyleIsPar);


	}


	private void vertexMultiGraphStyle(mxStylesheet stylesheet, boolean isPre ){

		// styles for multi-object rules

		if (isPre){

			/**	style for the Left minimal node deleted nodes (currently not reached)	*/		
			Hashtable<String, Object> lMinimalstyleMO = new Hashtable<String, Object>();
			lMinimalstyleMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
			lMinimalstyleMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			lMinimalstyleMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
			lMinimalstyleMO.put(mxConstants.STYLE_FILLCOLOR, "#FF8989");
			lMinimalstyleMO.put(mxConstants.STYLE_SHADOW, "true");
			
			stylesheet.putCellStyle("MinimalStyleMO", lMinimalstyleMO);			
		}
		else {

			/**	style for the Right minimal node  created nodes	*/
			Hashtable<String, Object> rMinimalStyleMO = new Hashtable<String, Object>();
			rMinimalStyleMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
			rMinimalStyleMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			rMinimalStyleMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
			rMinimalStyleMO.put(mxConstants.STYLE_SHADOW, "true");

			rMinimalStyleMO.put(mxConstants.STYLE_FILLCOLOR, "#C4FFC9");			
			stylesheet.putCellStyle("MinimalStyleMO", rMinimalStyleMO);

			/**	style for the Right minimal node created nodes in (parameters nodes)	*/
			Hashtable<String, Object> rMinimalStyleIsParMO = new Hashtable<String, Object>();
			rMinimalStyleIsParMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
			rMinimalStyleIsParMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			rMinimalStyleIsParMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
			rMinimalStyleIsParMO.put(mxConstants.STYLE_SHADOW, "true");

			rMinimalStyleIsParMO.put(mxConstants.STYLE_FONTCOLOR, "#216123");
			rMinimalStyleIsParMO.put(mxConstants.STYLE_FILLCOLOR, "#C4FFC9");
			stylesheet.putCellStyle("MinimalStyleIsParMO", rMinimalStyleIsParMO);
		}





		/**	style for the update minimal node 	*/
		Hashtable<String, Object> lrMinimalStyleMO = new Hashtable<String, Object>();
		lrMinimalStyleMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		lrMinimalStyleMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		lrMinimalStyleMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		lrMinimalStyleMO.put(mxConstants.STYLE_SHADOW, "true");

		lrMinimalStyleMO.put(mxConstants.STYLE_FILLCOLOR, "#F9FFC4");	
		stylesheet.putCellStyle("LRMinimalStyleMO", lrMinimalStyleMO);


		/**	style for the update minimal node in (this Object node)	*/
		Hashtable<String, Object> lrMinimalStyleIsThisMO = new Hashtable<String, Object>();
		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_SHADOW, "true");

		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_STROKEWIDTH, "1.5");
		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_DASHED, "1");

		lrMinimalStyleIsThisMO.put(mxConstants.STYLE_FILLCOLOR, "#F9FFC4");
		stylesheet.putCellStyle("LRMinimalStyleIsThisMO", lrMinimalStyleIsThisMO);


		/**	style for the update minimal node in (parameters nodes)	*/
		Hashtable<String, Object> lrMinimalStyleIsParMO = new Hashtable<String, Object>();
		lrMinimalStyleIsParMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		lrMinimalStyleIsParMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		lrMinimalStyleIsParMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		lrMinimalStyleIsParMO.put(mxConstants.STYLE_SHADOW, "true");
		lrMinimalStyleIsParMO.put(mxConstants.STYLE_FONTCOLOR, "#216123");
		lrMinimalStyleIsParMO.put(mxConstants.STYLE_FILLCOLOR, "#F9FFC4");
		stylesheet.putCellStyle("LRMinimalStyleIsParMO", lrMinimalStyleIsParMO);







		/**	style for the required context node 	*/
		Hashtable<String, Object> requiredStyleMO = new Hashtable<String, Object>();
		requiredStyleMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		requiredStyleMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		requiredStyleMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		requiredStyleMO.put(mxConstants.STYLE_SHADOW, "true");
		requiredStyleMO.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
		stylesheet.putCellStyle("RequiredStyleMO", requiredStyleMO);		


		/**	style for the required context node in (this Object node)	*/
		Hashtable<String, Object> requiredStyleIsThisMO = new Hashtable<String, Object>();
		requiredStyleIsThisMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		requiredStyleIsThisMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		requiredStyleIsThisMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);

		requiredStyleIsThisMO.put(mxConstants.STYLE_STROKEWIDTH, "1.5");
		requiredStyleIsThisMO.put(mxConstants.STYLE_SHADOW, "true");
		requiredStyleIsThisMO.put(mxConstants.STYLE_DASHED, "1");

		requiredStyleIsThisMO.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
		stylesheet.putCellStyle("RequiredStyleIsThisMO", requiredStyleIsThisMO);


		/**	style for the required context node in (parameters nodes)	*/
		Hashtable<String, Object> requiredStyleIsParMO = new Hashtable<String, Object>();
		requiredStyleIsParMO.put(mxConstants.STYLE_STROKECOLOR, "#1E1E1E");
		requiredStyleIsParMO.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		requiredStyleIsParMO.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_LEFT);
		requiredStyleIsParMO.put(mxConstants.STYLE_SHADOW, "true");
		requiredStyleIsParMO.put(mxConstants.STYLE_FONTCOLOR, "#216123");
		requiredStyleIsParMO.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
		stylesheet.putCellStyle("RequiredStyleIsParMO", requiredStyleIsParMO);

	}


	private String getStrNodeStyle(GNode vNode){

		String strNodeStyle="";

		if (vNode.isThis){

			if (vNode.isInitialized){
				// created node
				strNodeStyle= "MinimalStyle";   

			}
			else if (vNode.isMinimal){
				// updated node
				strNodeStyle= "LRMinimalStyleIsThis";  
			}
			else {
				// required node
				strNodeStyle= "RequiredStyleIsThis";
			}

		}
		else if (vNode.isParameters){

			if (vNode.isInitialized){
				// created node
				strNodeStyle= "MinimalStyleIsPar";   

			}
			else if (vNode.isMinimal){
				// updated node
				strNodeStyle= "LRMinimalStyleIsPar";  
			}
			else {
				// required node
				strNodeStyle= "RequiredStyleIsPar";
			}
		}
		else {

			if (vNode.isInitialized){
				// created node
				strNodeStyle= "MinimalStyle";   

			}
			else if (vNode.isMinimal){
				// updated node
				strNodeStyle= "LRMinimalStyle";  
			}
			else {
				// required node
				strNodeStyle= "RequiredStyle";				
			}
		}


		if (vNode.isMulti){
			strNodeStyle+="MO";
		}

		return strNodeStyle;
	}








	// **********************************************************************
	// **********************************************************************    
	// **********************************************************************

	private void visualiseGraph(){

		
		GraphT GT_DB= null;


		// load graph
		if (this.isMultiObject){

			GT_DB = new GraphT();
			GT_DB.graphID=this.iGraphID;

			if (!this.isRHS_Post){
				GT_DB.graphType=0;
			}
			else {
				GT_DB.graphType=1;
			}

			GT_DB.LoadMultiObjects(this.isViewingMinimalRule, !this.isInstance);
			
			if (GT_DB.graphType==0 && GT_DB.gNodes.size()==0){
				GT_DB = new GraphT(this.iGraphID, true, this.isViewingMinimalRule, !this.isInstance); 
			}
			
		}
		else {

			GT_DB = new GraphT(this.iGraphID, true, this.isViewingMinimalRule, !this.isInstance); 
		}



		//update node and edges of [GT_DB] based on levelOption

		if (this.ilevelOption!=3){
			// 1 high, 2 mid, 3 low
			this.viewCollectionObjectAsAssociation(GT_DB);
		}

		
		this.viewGraphT(GT_DB);

	}


	protected void visualiseGraph(
			int graphID,
			boolean IsInstance,
			boolean IsMultiObject,
			boolean IsRHS_Post,
			boolean IsViewingMinimalRule,
			int IlevelOption){

		this.iGraphID=graphID;
		this.isInstance = IsInstance;
		this.isMultiObject = IsMultiObject;
		this.isRHS_Post=IsRHS_Post;  
		this.isViewingMinimalRule=IsViewingMinimalRule;
		this.ilevelOption = IlevelOption;

		// set attribute icon to be visible
		this.attMenuItem.setVisible((!IsMultiObject && !IsInstance));
		this.attributeConstraints=null;

		this.visualiseGraph();
	}

	
	
	protected void visualiseGraph(
			int graphID,
			boolean IsInstance,
			boolean IsMultiObject,
			boolean IsRHS_Post,
			boolean IsViewingMinimalRule,
			int IlevelOption,
			NACinstance NACRule){
		
		this.nacRule = NACRule;
		this.visualiseGraph(
				graphID, 
				IsInstance, 
				IsMultiObject, 
				IsRHS_Post, 
				IsViewingMinimalRule, 
				IlevelOption);
	}




	protected void clearGraph(){

		this.graphComponent.setGraph(new mxGraph());
		this.graphComponent.repaint();
	}




	private void viewCollectionObjectAsAssociation(GraphT GT_DB){


		for (int iNode = GT_DB.gNodes.size()-1 ; iNode >=0; iNode--){    			

			GNode collectionNode = GT_DB.gNodes.get(iNode);

			if (!collectionNode.isCollection){
				continue;
			}



			String collectionMainSourceID="";
			int collectionMainSourceCount=0;

			for (int iEdge=0; iEdge<GT_DB.gEdges.size(); iEdge++){

				GEdge edgeCollectionMainSource = GT_DB.gEdges.get(iEdge);

				if (edgeCollectionMainSource.targetID.equals(collectionNode.nodeID)){
					collectionMainSourceCount++;
					collectionMainSourceID = edgeCollectionMainSource.sourceID;
				}				
			}



			// source ID must be one
			if (collectionMainSourceCount==1){


				// update edges source that were hold collectionID

				for (int iEdge=GT_DB.gEdges.size()-1; iEdge>=0; iEdge--){

					GEdge updatedEdge = GT_DB.gEdges.get(iEdge);

					if (updatedEdge.sourceID.equals(collectionNode.nodeID)){
						updatedEdge.sourceID=collectionMainSourceID;
					}

					if (updatedEdge.targetID.equals(collectionNode.nodeID)){
						GT_DB.removeEdge(iEdge);
					}
				}


				// remove collection
				GT_DB.removeNode(iNode);
			}
		}





	}




	private void viewGraphT(GraphT GT_DB) {


		
		
		
		/** define new maxGrpah to override the previous graph in the GTComponent*/
		mxGraph mxGraphT = new mxGraph();
		mxGraphT.setAllowDanglingEdges(true);
		this.graphComponent.setConnectable(true);
		this.graphComponent.setGraph(mxGraphT);


		// check attribute viewing
		boolean viewNodeAttributes = (this.ilevelOption!=1);


		// set style sheet colours
		this.vertexStyle(mxGraphT, (GT_DB.graphType==0));



		Object gParent = mxGraphT.getDefaultParent();
		mxGraphT.getModel().beginUpdate();

		try {

			
			
			ArrayList<Object> vertexList= new ArrayList<Object>();        	
			// Iterator to add vertex
			Iterator<GNode> itrNode = GT_DB.gNodes.iterator();
			while(itrNode.hasNext()){

				
				
				GNode vNode = itrNode.next();

				if (this.isViewingMinimalRule && !vNode.isMinimal){
					vertexList.add(null);
					continue;
				}


				Object newVertex=null;
				int iHigh = this.customisingVertexText(vNode, viewNodeAttributes, this.isInstance);

				newVertex = mxGraphT.insertVertex(
						gParent, 
						null, 
						vNode.nodeType, 10, 10, 150, iHigh, this.getStrNodeStyle(vNode)); 								


				vertexList.add(newVertex);
			}


			// Iterator to add Edges
			Iterator<GEdge> itrEdge = GT_DB.gEdges.iterator();
			while(itrEdge.hasNext()){

				
				GEdge vEdge = itrEdge.next();

				if (this.isViewingMinimalRule && !vEdge.isMinimal){
					continue;
				}    		

				Object edgeSource= vertexList.get(GT_DB.getNodeIndex(vEdge.sourceID));
				Object edgeTarget= vertexList.get(GT_DB.getNodeIndex(vEdge.targetID));

				if (vEdge.isMinimal){
					mxGraphT.insertEdge(gParent, null, vEdge.edgeType, edgeSource, edgeTarget, "EdgeMinimalStyle");
				}
				else {
					mxGraphT.insertEdge(gParent, null, vEdge.edgeType, edgeSource, edgeTarget, "strokeColor=#1E1E1E;");
				}
			}        	

		} 

		finally {
			mxGraphT.getModel().endUpdate();
		}


		// define layout
		this.setVisualGraphLayout(mxGraphT);
	}



	private void setVisualGraphLayout(mxGraph mxGraphT){


		

		//define layout
		mxIGraphLayout layout = null;
		if (this.isTreeLayout){
			layout =new mxCompactTreeLayout(mxGraphT);
		}
		else {
			layout =  new mxCircleLayout(mxGraphT);
		}



		//* layout using morphing
		mxGraphT.getModel().beginUpdate();        
		try {
			layout.execute(mxGraphT.getDefaultParent());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally {

			mxMorphing morph = new mxMorphing(this.graphComponent, 20, 1.2, 20);            
			morph.startAnimation();


		}
		if (enableEditing){
			mxGraphT.getModel().endUpdate();  
		}


		
	}



	private int customisingVertexText(
			GNode vNode,
			boolean viewNodeAttributes,
			boolean isInstance){


		int vHigh=35;


		if (isInstance){

			vNode.nodeType= vNode.nodeID + ":" + vNode.nodeType;			
			vNode.nodeType +="\n________________________";

			if (viewNodeAttributes){

				Iterator<GAttribute> itrNodeAttributes =vNode.gAttribute.iterator();
				while(itrNodeAttributes.hasNext()){

					GAttribute nodeAttribute = itrNodeAttributes.next();
					vNode.nodeType +="\n "+ nodeAttribute.attName + "=" + nodeAttribute.attValue; 					
					vHigh+=18;
				}
			}	

		}
		else {

			if (vNode.isThis){
				vNode.nodeType= " this-" + vNode.AbstractID + " : " + vNode.nodeType;
			}
			else if (vNode.isReturn){
				vNode.nodeType= " rePar-" + vNode.AbstractID + " : " + vNode.nodeType;
			}
			else if (vNode.iParameterIndex>0){
				vNode.nodeType= " Par" + vNode.iParameterIndex + "-" + vNode.AbstractID + " :" + vNode.nodeType;
			}
			else {
				vNode.nodeType= vNode.AbstractID + " :" + vNode.nodeType;
			}			
			vNode.nodeType = vNode.nodeType.replace("null", "");
			vNode.nodeType +="\n________________________";

			if (viewNodeAttributes){

				Iterator<GAttribute> itrNodeAttributes =vNode.gAttribute.iterator();
				while(itrNodeAttributes.hasNext()){

					GAttribute nodeAttribute = itrNodeAttributes.next();
					vNode.nodeType +="\n "+ nodeAttribute.attName;
					/*/if (nodeAttribute.attIsAssignedToParameter){
						vNode.nodeType +="\n "+ nodeAttribute.attName + "==[" + nodeAttribute.attGeneralisedValue+"]";
					}
					else if (nodeAttribute.attGeneralisedValue.length()!=0) {
						vNode.nodeType +="\n "+ nodeAttribute.attName + "==" + nodeAttribute.attGeneralisedValue;						
					}
					else {
						vHigh-=18;
					}*/
					vHigh+=18;
				}
			}
		}		


		return vHigh;
	}
















	private void viewSelectedNodeFromGraph(String objectID){

		if (this.isMultiObject){
			return;
		}

		Window w = SwingUtilities.windowForComponent(this.JPanelContainer);
		JFrame parentFrame=null;

		if (w instanceof JFrame) {
			parentFrame = (JFrame) w;
		}


		JDialog nodeDetailsDialog = new JDialog(parentFrame, true);        

		nodeDetailsDialog.setAlwaysOnTop(true);
		nodeDetailsDialog.setSize(500, 220);
		nodeDetailsDialog.setMinimumSize(nodeDetailsDialog.getSize());
		nodeDetailsDialog.setLocationRelativeTo(null);
		nodeDetailsDialog.setTitle("Node Details ...");
		int iIndex= objectID.indexOf("\n");
		if (iIndex>0){
			nodeDetailsDialog.setTitle("Node Details [" + objectID.substring(0, iIndex) + "]");
		} 



		JTextPane textPanesNodeDetails = new JTextPane();
		textPanesNodeDetails.setContentType("text/html");
		String strNodeDetails="";

		if (this.isInstance){
			strNodeDetails=this.nodeDetailsDialogFromInstance(objectID);
		}
		else {
			strNodeDetails=this.nodeDetailsDialogFromNoNInstance(objectID);
		}



		// check text
		if (strNodeDetails.length()==0){        	
			return;
		}
		else {
			textPanesNodeDetails.setText(strNodeDetails);
		}





		Font font = UIManager.getFont( "Label.font" );
		String bodyRule =
				"body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
		((HTMLDocument) textPanesNodeDetails.getDocument()).getStyleSheet().addRule(bodyRule);


		JScrollPane scrollNodeDetails = new JScrollPane(textPanesNodeDetails);

		nodeDetailsDialog.add(scrollNodeDetails);


		// dialog to show a list of info
		nodeDetailsDialog.setVisible(true);

	}



	private String nodeDetailsDialogFromInstance(String objectID){


		String strNodeDetails= "<html><body style=\"background-color: #F5F5DF\">" ;                      
		strNodeDetails +=objectID.replace("_", "").replace("\n", "<br />");


		int iIndex= objectID.indexOf(":");
		if (iIndex>0){
			objectID = objectID.substring(0, iIndex);
		}


		// show access type / steps and location in the code        
		CachedRowSetImpl crsNodeDetails = DBRecord.getByQueryStatement(
				"select accessedInfo "
						+ " from TblNode"
						+ " where Graph_IDREFF=" + this.iGraphID
						+ " and nodeID='" + objectID + "';");

		try {

			if (crsNodeDetails.next()){

				strNodeDetails +="<P style=\"text-align:center; font-weight:bold\">Access and code location details</P>"
						+ "<table cellspacing=^0^ cellpadding=^5px^ border=^1^ style=^margin:4px 4px 4px 4px; width:100%; border-collapse: collapse; border: 1px; background-color: #FFFFFF;^>".replace("^", "\"")
						+ "<tr style=\" background-color: #DEDEC1;\">"
						+ "<td>Access Type</td>"
						+ "<td>Internal State (step No)</td>"
						+ "<td>Code Location (line No)</td>"
						+ "</tr>";

				String[] accessStepAndLocations= crsNodeDetails.getString(1).split("/");
				for (iIndex=0; iIndex<accessStepAndLocations.length; iIndex++){


					String acessInfo = accessStepAndLocations[iIndex].trim();

					if (acessInfo.length()==0){
						continue;
					}


					// Structure is : [ini/read/write access], [internal step 15], [code line 70]
					String[] extractAccessDetails =acessInfo.split(",");

					if (extractAccessDetails.length!=3){
						continue;
					}

					strNodeDetails+="<tr>";

					extractAccessDetails[0] = extractAccessDetails[0].trim();
					if (extractAccessDetails[0].equalsIgnoreCase("i")){
						strNodeDetails+="<td>initialise</td>";
					}
					else if (extractAccessDetails[0].equalsIgnoreCase("r")){
						strNodeDetails+="<td>read</td>";
					}
					else if (extractAccessDetails[0].startsWith("r")){
						strNodeDetails+="<td>read " + extractAccessDetails[0].substring(1) + "</td>";
					}
					else if (extractAccessDetails[0].equalsIgnoreCase("w")){
						strNodeDetails+="<td style=\"color: #78110A\">write</td>";
					}
					else if (extractAccessDetails[0].startsWith("w")){
						strNodeDetails+="<td style=\"color: #78110A\">write"+ extractAccessDetails[0].substring(1) + "</td>";
					}

					strNodeDetails+= "<td>" + extractAccessDetails[1] + "</td>";
					strNodeDetails+= "<td>" + extractAccessDetails[2] + "</td>";

					strNodeDetails+= "</tr>";
				}

				strNodeDetails+="</table>";
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}


		strNodeDetails+="</body></html>";


		return strNodeDetails;
	}



	private String nodeDetailsDialogFromNoNInstance(String objectID){


		int iIndex = objectID.indexOf(":");

		if (iIndex<1){
			return "";
		}

		String strNodeAbstractID= objectID.substring(0, iIndex).trim();		
		if (strNodeAbstractID.split("-").length==2){
			strNodeAbstractID = strNodeAbstractID.split("-")[1].trim();
		}


		if (strNodeAbstractID.equalsIgnoreCase("null")){
			return "";
		}


		// load constants on arraylist [this.attributeConstants]
		this.loadAttributeConstants();


		String strNodeDetails= "<html><body style=\"background-color: #F5F5DF\"><ol type=\"1\">" ;  
		boolean isThereConstraints=false;
		for (int i=0; i<this.attributeConstraints.size(); i++){

			// check relevant Invariants for selected node
			String invLine= this.attributeConstraints.get(i).toLowerCase();
			if (!invLine.contains(strNodeAbstractID.toLowerCase())){
				continue;
			}

			
			// add invariant line ..  
			if (invLine.contains("_par") || invLine.contains("return")){
				strNodeDetails+="<li style=\"color: red;\">" +  this.attributeConstraints.get(i) + "</li>";
			}
			else{
				strNodeDetails+="<li>" +  this.attributeConstraints.get(i) + "</li>";
			}
			
			isThereConstraints=true;
		}

		// message if there is no constraints on attributes
		if (!isThereConstraints){
			strNodeDetails+="<li>No constraints being found!</li>";
		}

		strNodeDetails+="</ol></body></html>";

		return strNodeDetails;
	}


	private void loadAttributeConstants(){

		

		if (this.attributeConstraints!=null){
			return;
		}
		
		// works only with NAC view ..
		if (this.nacRule!=null){
			this.attributeConstraints = this.nacRule.getAttributesConstraints();
			return;
		}
		
		this.attributeConstraints= new ArrayList<String>();



		// load invariants from database    		
		CachedRowSetImpl crsAttributeConstants = DBRecord.getByQueryStatement(
				"select RuleAttributeConditions from TblObservationOutput "
						+ "where (RuleAttributeConditions is not null or RuleAttributeConditions='') and Observation_ID=("
						+ "select Observation_IDREFF from TblGraph where GraphID="
						+ this.iGraphID + ");");

		try {

			if (crsAttributeConstants.next()){

				char chars[] = crsAttributeConstants.getString(1).toCharArray();

				String strLineCollection="";
				for(int i=0; i<chars.length; i++){

					if (chars[i]=='\n'){
						this.attributeConstraints.add(strLineCollection);
						strLineCollection="";
						continue;
					}

					strLineCollection+=chars[i];
				}
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}





	private void viewInvariantsFromSide(){


		// load constants on array list [this.attributeConstants]
		this.loadAttributeConstants();


		if (this.attributeConstraints.size()<1){
			return;
		}


		Window w = SwingUtilities.windowForComponent(this.JPanelContainer);
		JFrame parentFrame=null;

		if (w instanceof JFrame) {
			parentFrame = (JFrame) w;
		}


		JDialog attributeDetailsDialog = new JDialog(parentFrame, true);        

		attributeDetailsDialog.setAlwaysOnTop(true);
		attributeDetailsDialog.setSize(550, 220);
		//attributeDetailsDialog.setMinimumSize(attributeDetailsDialog.getSize());
		attributeDetailsDialog.setLocationRelativeTo(null);
		attributeDetailsDialog.setTitle("Invariant Constraints on Attributes");


		JTextPane textPanesInvariantDetails = new JTextPane();
		textPanesInvariantDetails.setContentType("text/html");





		String strInvariantDetails= "<html><body style=\"background-color: #F5F5F5\"><ol type=\"1\">" ;  
		boolean isThereConstraints = false;

		for (int i=0; i<this.attributeConstraints.size(); i++){

			// check relevant Invariants for graph side : LHS or RHS

			String[] invLine= this.attributeConstraints.get(i).toLowerCase().split("_");

			if (invLine.length<2){
				continue;
			}

			String strInvLine = this.attributeConstraints.get(i).toLowerCase();
			if (!this.isRHS_Post && invLine[1].contains("pre")){

				// view in LHS
				if (strInvLine.contains("_par") || strInvLine.contains("return")){
					strInvariantDetails+="<li style=\"color: red;\">" +  this.attributeConstraints.get(i) + "</li>";
				}
				else{
					strInvariantDetails+="<li>" +  this.attributeConstraints.get(i) + "</li>";
				}

				isThereConstraints=true;
			}
			else if(this.isRHS_Post && invLine[1].contains("post")){

				// view in RHS				
				if (strInvLine.contains("_par") || strInvLine.contains("return")){
					strInvariantDetails+="<li style=\"color: red;\">" +  this.attributeConstraints.get(i) + "</li>";
				}
				else{
					strInvariantDetails+="<li>" +  this.attributeConstraints.get(i) + "</li>";
				}

				isThereConstraints=true;
			}
			else if (!invLine[1].contains("pre") && !invLine[1].contains("post")){

				strInvariantDetails+="<li style=\"color: red;\">" +  this.attributeConstraints.get(i) + "</li>";
				isThereConstraints=true;
			}


		}

		// message if there is no constraints on attributes
		if (!isThereConstraints){
			strInvariantDetails+="<li>No constraints being found!</li>";
		}

		strInvariantDetails+="</ol></body></html>";
		textPanesInvariantDetails.setText(strInvariantDetails);






		Font font = UIManager.getFont( "Label.font" );
		String bodyRule =
				"body { font-family: " + font.getFamily() + "; " + "font-size: " + font.getSize() + "pt; }";
		((HTMLDocument) textPanesInvariantDetails.getDocument()).getStyleSheet().addRule(bodyRule);


		JScrollPane scrollNodeDetails = new JScrollPane(textPanesInvariantDetails);

		attributeDetailsDialog.add(scrollNodeDetails);


		// dialog to show a list of info
		attributeDetailsDialog.setVisible(true);

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
