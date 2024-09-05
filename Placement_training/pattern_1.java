package Placement_training;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int temp=0,j=0;
		int tem=0;
		for(int i=num; i>0; i--) {
			for(j=0;j<num-i;j++) {
				System.out.print("--");
			}
			for(j=1; j<=i; j++) {
				tem=j+temp;
				System.out.print(tem+"*");
				}
			temp += j-1;
			System.out.println();
			}
		in.close();
	}}

