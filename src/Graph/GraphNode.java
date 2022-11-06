package Graph;

public class GraphNode {
	public String node;
	public int index;
	public boolean isVisited=false;
	//Adjacency Matrix
	public GraphNode(String node, int index) {
		this.node=node;
		this.index=index;
	}

}
