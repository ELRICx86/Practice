package Graph;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(graph.toString());

	}

}
