package Recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class SubSequence {
	
	
	static HashSet<String> set=new HashSet<>();
	
	static ArrayList<String> strlist=new ArrayList<>();
	
	static void subseq(String str, int idx,String s){
		
		if(idx==str.length()) {
			
			if(set.contains(s)) {
				return;
			}
			else {
			strlist.add(s);
			set.add(s);
			return;
			}
		}
		
		char ch=str.charAt(idx);
		subseq(str, idx+1,s+ch);
		subseq(str, idx+1, s);
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str="abc";
		subseq(str, 0,"");
		
		System.out.println(strlist);//if u dont want unique just remove the hashset

	}

}
