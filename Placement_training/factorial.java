package Placement_training;

import java.util.Scanner;

public class factorial {

	static int[] f(int n)
	  {
	      int ar[] = new int[n+1];
	      ar[0]=1;
	      
	      for (int i=1;i<=n;i++){
	          ar[i] = i*ar[i-1];
	      } 
	      return ar;
	  }
	  
	  
	  public static void main(String args[])
	  {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   	int fact[] = f(n);
	   	for (int i=0;i<=n;i++){
	         System.out.print( fact[i]+" "); 
	      } 
	   	sc.close();
	  }
}
