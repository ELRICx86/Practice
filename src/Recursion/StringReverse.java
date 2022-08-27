package Recursion;

import java.security.Principal;

public class StringReverse {
	public static String str1="";
	
	static String revString2(String str) {
		if(str.length()<=1)return str;
		return revString2(str.substring(1))+str.charAt(0);
	}
	
	
	static String revString3(String str,int len) {
		if(len==0) return "";
		else {
		str1+=str.charAt(len-1);
		revString3(str,len-1);
		}
		return str1;
	}
	
	
	static String Revstr(String str,int len) {
		if(len==-1)return str;
		
		Revstr(str, len-1);
		str1=str.charAt(len)+str1;
		
		return str1;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="12";
		//System.out.println(Revstr(str, str.length()-1));
		System.out.println(revString2(str));
		System.out.println(revString3(str, str.length()));

	}

}
