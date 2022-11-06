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
	
	
	//get neighbor
	public List<GraphNode> 	getNeighbor(GraphNode node){
		List<GraphNode> neighbor=new ArrayList<>();
		int index=node.index;
		for(int i=0;i<adjacencyMatrix[0].length;i++) {
			if(adjacencyMatrix[index][i]==1) {
				neighbor.add(graph.get(i));
			}
		}
		return neighbor;
	}
	
	public void bfsvisit(GraphNode node) {
		LinkedList<GraphNode> queue=new LinkedList<>();
		if(!node.isVisited)
			queue.add(node);
		
		while(!queue.isEmpty()) {
			
//			for(GraphNode n:queue) {
//				System.out.print(n.node+" ");
//			}
			//System.out.println();
			GraphNode currnetNode=queue.remove(0);
			currnetNode.isVisited=true;
			
			System.out.print(currnetNode.node+" -> ");
			
			List<GraphNode> neighbors=getNeighbor(currnetNode);
			
			
			for(int i=0;i<neighbors.size();i++) {
				if(!neighbors.get(i).isVisited) {
					queue.add(neighbors.get(i));
					neighbors.get(i).isVisited=true;
				}
			}
		}
	}
	
	public void bfs() {
		for(GraphNode n:graph) {
			//if(!n.isVisited)
			bfsvisit(n);
		}
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
