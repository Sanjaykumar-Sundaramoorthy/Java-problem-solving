package Placement_training;
import java.util.*;

public class number_swap {
	  public static void main(String args[])
	  {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int temp = 0;
	    for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	    	if(arr[i]%2!=0) {
	    	for(int j=i;j < n;j++){
			      if(arr[j]%2==0){
			    	  temp = arr[i];
			    	  arr[i] = arr[j];
			    	  arr[j] = temp;
			      }
		    }  
	    	}
		    }
	    for(int i=0;i<n;i++){
	    	System.out.println(arr[i]);
		    }
	    sc.close();
	  }
	}

