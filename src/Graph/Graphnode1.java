package Graph;
import java.util.*;
public class Graphnode1 {
	public String node;
	public int index;
	//Adjacency list
	List<Graphnode1> neighbour=new ArrayList<>();
	
	public Graphnode1(String node,int index) {
		this.index=index;
		this.node=node;
		
	}
	
}
