package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	
	public static void merge(int[] ll,int[] rr,int[] aa) {
		int i=0;
		int j=0;
		int k=0;
		int nl=ll.length;
		int nr=rr.length;
		while(i<nl && j<nr) {
			if(ll[i]<=rr[j]) {
				aa[k]=ll[i];
				i++;
			}
			else {
				aa[k]=rr[j];
				j++;
			}
			k++;
		}
		while(i<nl) {
			aa[k]=ll[i];
			i++;
			k++;
		}
		while(j<nr) {
			aa[k]=rr[j];
			j++;
			k++;
		}
	}
	
	
	public static void merge_sort(int[] a) {
		int n=a.length;
		if(n<2) {
			return;
		}
		int mid=n/2;
		int l[]=new int[mid];
		int r[]=new int[n-mid];
		
		for(int i=0;i<mid-1;i++) {
			l[i]=a[i];
		}
		
		for(int j=mid;j<n-1;j++) {
			r[j]=a[j];
		}
		
		merge_sort(l);
		merge_sort(r);
		
		merge(l,r,a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=inp.nextInt();
		}
		
		//merge_sort(arr);
		
		int maxele = Arrays.stream(arr).max().getAsInt()+1;
		System.out.println(maxele);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
