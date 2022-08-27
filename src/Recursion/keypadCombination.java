package Recursion;

import java.util.ArrayList;

public class keypadCombination {
	
	
	static String[] keypd= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	
	static ArrayList<String> comb=new ArrayList<>();
	
	static void keypad(String s,int idx,String t) {
		
		if(idx==s.length()) {
			comb.add(t);
			return;
		}
		
		int num=s.charAt(idx)-'0';
		String code=keypd[num];
		for(int i=0;i<code.length();i++) {
			keypad(s,idx+1,t+code.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="234";
		keypad(st, 0, "");
		System.out.println(comb);

	}

}
