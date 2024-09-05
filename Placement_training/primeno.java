package Placement_training;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		int num = in.nextInt();
		
		for(i = 2; i<num; i++) {
			if(num % i ==0) {
				System.out.println("not prime");
				break;
			}
			else 
				System.out.println("prime");
			break;
		}
		in.close();
	}

}
