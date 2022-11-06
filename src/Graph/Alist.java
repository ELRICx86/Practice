package Graph;
import java.util.*;

import javax.crypto.BadPaddingException;
public class Alist {

	//created graph class
	static public class graph {
		
		//edge class consists of vertex and weight
		class edge{
			int v;
			int w;
			public  edge(int v,int w) {
				this.v=v;
				this.w=w;
			}
			@Override
			public String toString() {
				
				return "("+v+" , "+w+")";
			}
			
		}
		//list of linked list implementation.....
		List<LinkedList<edge>> vertex=new ArrayList<LinkedList<edge>>();
		//graph constructor
		public graph(int n) {
			for(int i=0;i<n;i++) {
				vertex.add(new LinkedList<>());
			}
		}
		
		//check if the edges are connected or not
		boolean isconnected(int u, int v) {
			for(edge i: vertex.get(u)) {
				if(i.v==v) {
					return true;
				}
			}
			return false;
		}
		
		
		//BFS starts from 0th index 
		public void bfsVisited(int i,boolean vis[]) {
			LinkedList<Integer> queue=new LinkedList<>();
			LinkedList<edge> current=new LinkedList<>();
			//current = vertex.get(i);
			if(!vis[i])
				queue.add(i);
			
			//System.out.println(queue);
			
			while(!queue.isEmpty()) {
				int curr=queue.remove(0);
				vis[curr]=true;
				current=vertex.get(curr);
				System.out.print(curr+" --> ");
				for(edge k:current) {
					if(!vis[k.v]) {
						queue.add(k.v);
						vis[k.v]=true;
					}
				}
			}
		}
		
		//bfs helper so that it can loop from 0
		public void bfs(boolean []vis) {
			for(int i=0;i<vertex.size();i++) {
				Arrays.fill(vis, false);
				bfsVisited(i, vis);
				System.out.println();
			}
		}
		
		
		public void dfsvis(int i,boolean [] vis) {
			Stack<Integer> stack=new Stack<>();
			LinkedList<edge> current=new LinkedList<>();
			current = vertex.get(i);
			if(!vis[i]) {
				stack.push(i);
			}
			while(!stack.isEmpty()) {
				int curr=stack.pop();
				vis[curr]=true;
				current=vertex.get(curr);
				System.out.print(curr+" --> ");
				for(edge k:current) {
					if(!vis[k.v]) {
						stack.push(k.v);
						vis[k.v]=true;
					}
				}
			}
		}
		
		
		public void dfs(boolean [] vis) {
			for(int i=0;i<vertex.size();i++) {
				Arrays.fill(vis, false);
				dfsvis(i, vis);
				System.out.println();
			}
		}
		
		
		//adding edge
		void addedge(int u,int v, int w) {
			vertex.get(u).add(0, new edge(v, w)); //adding in front of linked list is O(1) 
		}
		@Override
		public String toString() {
			String res="";
			for(int i=0;i<vertex.size();i++) {
				res+=i+" -> "+vertex.get(i)+"\n";
			}
			return res;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		graph g=new graph(10);
		boolean vis[]=new boolean [10];
		g.addedge(0, 2, 12);
		g.addedge(0, 4, 1);
		g.addedge(0, 7, 2);
		g.addedge(2, 3, 22);
		g.addedge(5, 3, 20);
		g.addedge(0, 9, 2);
		g.addedge(3, 4, 22);
		g.addedge(3, 7, 20);
		g.addedge(8, 9, 1);
		g.addedge(9, 1, 2);
		g.addedge(2, 4, 22);
		g.addedge(5, 2, 20);
		
		//System.out.println(g.isconnected(0, 4));
		System.out.println(g);
		System.out.println("******** B F S *********");
		g.bfs(vis);
		System.out.println("******** D F S *********");
		g.dfs(vis);
	}

}
