package Graph;
import java.util.*;
public class Graph {
	List<GraphNode> graph=new ArrayList<>();
	int [][] adjacencyMatrix;
	//adjacency Matrix
	public Graph(List<GraphNode> graph) {
		this.graph=graph;
		adjacencyMatrix=new int[graph.size()][graph.size()];
	}
	//unweighted graph
	public void addEdge(int i,int j) {
		adjacencyMatrix[i][j]=1;
		adjacencyMatrix[j][i]=1;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("   ");
		
		for(int i=0;i<graph.size();i++) {
			sb.append(graph.get(i).node).append(" ");
		}
		sb.append("\n");
		for(int i=0;i<graph.size();i++) {
			
			sb.append(graph.get(i).node).append(": ");
			for(int j:adjacencyMatrix[i]) {
				sb.append(j+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
