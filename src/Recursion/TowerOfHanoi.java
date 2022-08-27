package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	static void ToH(int n,int s,int m, int d) {
		if(n==1) {
			System.out.println(s+" "+d);
			return;
		}
		
		ToH(n-1, s, d, m);
		System.out.println(s+" "+d);
		ToH(n-1, m, s, d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		System.out.println((int)Math.pow(2, n)-1);
		ToH(n, 1, 2, 3);
		

	}

}

