package Placement_training;

import java.util.*;

public class binarysearch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		int index=binarySearch(a,ele);
		System.out.print(index);
		sc.close();
		
	}
	public static int binarySearch(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
		}
		return -1;
	}
}