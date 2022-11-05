package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph1 {
	//Adjacency list 
	List<Graphnode1> nodelist=new ArrayList<>();

	public Graph1 (List<Graphnode1> nodelist) {
		this.nodelist=nodelist;
	}
	
	public void addEdge(int i,int j) {
		Graphnode1 first=nodelist.get(i);
		Graphnode1 second=nodelist.get(j);
		first.neighbour.add(second);
		second.neighbour.add(first);
	}
	
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<nodelist.size();i++) {
			sb.append(nodelist.get(i).node).append(": ");
			for(int j=0;j<nodelist.get(i).neighbour.size();j++) {
				if (j == nodelist.get(i).neighbour.size()-1 ) {
			          sb.append((nodelist.get(i).neighbour.get(j).node) );
			        } else {
			          sb.append((nodelist.get(i).neighbour.get(j).node) + " -> ");
			        }
			      }
			      sb.append("\n");
			}
		return sb.toString();
	}

}
