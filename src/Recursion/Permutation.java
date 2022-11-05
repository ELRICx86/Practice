package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {
	
	static List<String> perm=new ArrayList<>();
	static Set<String> set=new HashSet<>();
	static void perm(String s,String t) {
		if(s.length()==0) {
			
			if(set.contains(t))
			
			return;
			else {
				set.add(t);
				perm.add(t);
				return;
			}
		}
		
		for(int i=0;i<s.length();i++) {
			String st=s.substring(0,i)+s.substring(i+1);
			perm(st,t+s.charAt(i));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabac";
		perm(s, "");
		System.out.println(perm.size());
		for(int i=0;i<perm.size();i++) {
			System.out.println(perm.get(i));
		}

	}

}
