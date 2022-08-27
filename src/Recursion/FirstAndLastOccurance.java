package Recursion;

public class FirstAndLastOccurance {
	
	
	static int first=-1;
	static int last=-1;
	
	
	
	static public void occur2(String s, int idx,char a) {
		if(idx==s.length()) {
			System.out.println("first "+first);
			System.out.println("Last "+ last);
			return;
		}
		if(s.charAt(idx)==a && first==-1) {
			first=idx;
			last=idx;
		}
		else if (s.charAt(idx)==a){
			last=idx;
		}
		occur2(s, idx+1, a);
	}
	
	
	
	static public void occur(String s, int idx,char a) {
		if(idx==s.length()) {
			//System.out.println(first);
			System.out.println("Last "+last);
			return;
		}
		
		if(s.charAt(idx)==a) {
			last=idx;
		}
		occur(s, idx+1, a);
		if(s.charAt(idx)==a)first=idx;
		
		if(idx==0)System.out.println("first "+first);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="babbcabbcaz";
		occur(string, 0, 'a');//utilizes the return property of call stack.
		first=-1;last=-1;
		System.out.println("################################");
		occur2(string, 0, 'a');//general method;
				

	}

}
