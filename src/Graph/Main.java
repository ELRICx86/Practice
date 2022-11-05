package Graph;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Adjacency Matrix
		
		List<GraphNode> nodes=new ArrayList<>();
		nodes.add(new GraphNode("A", 0));
		nodes.add(new GraphNode("B", 1));
		nodes.add(new GraphNode("C", 2));
		nodes.add(new GraphNode("D", 3));
		nodes.add(new GraphNode("E", 4));
		nodes.add(new GraphNode("F", 5));
		
		
		Graph graph=new Graph(nodes);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 5);
		graph.addEdge(2, 5);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 2);
		graph.addEdge(5, 1);
		
		//System.out.println(graph.toString());
		
		//Adjacency List
		List<Graphnode1> nodelist=new ArrayList<>();
		nodelist.add(new Graphnode1("A", 0));
		nodelist.add(new Graphnode1("B", 1));
		nodelist.add(new Graphnode1("C", 2));
		nodelist.add(new Graphnode1("D", 3));
		nodelist.add(new Graphnode1("E", 4));
		
		
		Graph1 graph1=new Graph1(nodelist);
		
		graph1.addEdge(0, 1);
		graph1.addEdge(0, 2);
		graph1.addEdge(0, 3);
		graph1.addEdge(1, 4);
		graph1.addEdge(2, 3);
		graph1.addEdge(3, 4);
		
		System.out.println(graph1.toString());
		
		
		
		

	}

}
