package Placement_training;

import java.util.Scanner;

public class primeprint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=2; i<=num; i++) {
			int temp = 1;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					temp = 0;
					break;
				}
				
			}
			if(temp==1)
			{
				System.out.println(i);
			}
		}
		in.close();
	}

}
