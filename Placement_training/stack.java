package Placement_training;

import java.util.*;

class Stacked{
	int max_size = 100;
	int arr[] = new int[max_size];
	int top;
	
	Stacked() {
		top = -1;
	}
	
	void push(int ele) {
		if(top == max_size - 1) {
			System.out.println("Stack is full");
		}
		else {
			arr[++top] = ele;
		}
	}
	
	void pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			--top;
		}
	}
	
	boolean isempty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isfull() {
		if(top == max_size - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int top() {
		if(top == -1) {
			return -1;
		}
		else {
			return arr[top];
		}
	}
	
}

public class stack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Stacked st = new Stacked();		
		int n;
		int ele;
		do {
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.check if empty");
			System.out.println("4.check if full");
			System.out.println("5.print top of the stack");
			System.out.println("6.quit");	
			System.out.println("Enter your choice : ");
			n = in.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("Enter a element to push : ");
				ele = in.nextInt();
				st.push(ele);
				System.out.println("\n");
				break;
			case 2:
				st.pop();
				System.out.println("an element is popped");
				System.out.println("\n");
				break;
			case 3:
				boolean isempty = st.isempty();
				if(isempty == true) {
					System.out.println("Stack is empty");
					System.out.println("\n");
				}
				else {
					System.out.println("Stack is not empty");
					System.out.println("\n");
				}
				break;
			case 4:
				boolean isfull = st.isfull();
				if(isfull == true) {
					System.out.println("Stack is full");
					System.out.println("\n");
				}
				else {
					System.out.println("Stack is not full");
					System.out.println("\n");
				}
				break;
			case 5:
				int top = st.top();
				System.out.println("top of the stack is "+top);
				System.out.println("\n");
				break;
			case 6:
				System.out.println("Execution of program is stopped ");
				System.out.println("\n");
				break;	
			default:
				System.out.println("Enter a valid choice");
				System.out.println("\n");
				break;
			}
			
		}while(n != 6);
		in.close();
	}

}
