package graph.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import graph.Edge;
import graph.Graph;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Node;


public class Graph2EMFTransformer {

	public static final String PREFIX_POSITIVE = "example";
	public static final String PREFIX_NEGATIVE = "negative";
	public static final String FILE_EXTENSION = ".g";
	public static final String MODEL_TYPE = "graph";
	
	public static void main(String[] args) {

//		operationWhiteList.add("pullUpAttribute_5");

		// We just scan the file system for examples
		File workingDir = new File("");
		String examplesPath = workingDir.getAbsolutePath() + File.separator + ".." + File.separator + "Examples";
		String modelsPath = examplesPath + File.separator + MODEL_TYPE;
		File modelsFolder = new File(modelsPath);

		File[] operations = modelsFolder.listFiles();
		Arrays.sort(operations);
		
		System.out.println(modelsPath);
		for (File operation : operations) {

			File[] examples = operation.listFiles();

			for (File example : examples) {
				
				Graph2EMFTransformer t = new Graph2EMFTransformer();

				if (example.getName().startsWith(PREFIX_POSITIVE)) {
					System.out.println("\n= Positive example " + example.getName());

					String pathOriginal = example.getAbsoluteFile() + File.separator + "Original";
					String pathChanged = example.getAbsoluteFile() + File.separator + "Changed";
					
					try{
						t.transform(pathOriginal);
						t.transform(pathChanged);
					} catch(IOException e){
						e.printStackTrace();
					}
				} else {
					String negativePath = example.getAbsoluteFile() + File.separator + "Negative";
					
					try{
						t.transform(negativePath);
					} catch(IOException e){
						e.printStackTrace();
					}
				}
					
			}
		}

	}

	private void transform(String path) throws IOException{
		Graph graph = buildGraph(path + FILE_EXTENSION);

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("graph", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI
                .createFileURI(path + ".graph"));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(graph);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   }
		
	
	private Graph buildGraph(String path) throws IOException{
		GraphPackage.eINSTANCE.eClass();
		GraphFactory graphFactory = GraphFactory.eINSTANCE;
		Graph graph = graphFactory.createGraph();
		
		FileInputStream fstream = new FileInputStream(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  String[] data = strLine.split("\\s");
		  assert(data.length == 2);
		  
		  Node src = addNode(graph, graphFactory, data[0]);
		  Node trgt = addNode(graph, graphFactory, data[1]);
		  addEdge(graph, graphFactory, src, trgt);
		}

		//Close the input stream
		br.close();
		
		return graph;
	}
	
	private Node addNode(Graph graph, GraphFactory factory, String name){
		EList<Node> nodes = graph.getNodes();
		ListIterator<Node> iterator = nodes.listIterator();
		Node node;
	
		while(iterator.hasNext()){
			node = iterator.next();
			
			if(node.getName().equals(name))
				return node;
		}
		
		node = factory.createNode();
		node.setName(name);
		graph.getNodes().add(node);
		
		return node;
	}
	
	private void addEdge(Graph graph, GraphFactory factory, Node source, Node target){
		Edge edge = factory.createEdge();
		edge.setSource(source);
		edge.setTarget(target);
		graph.getEdges().add(edge);
	}
}
