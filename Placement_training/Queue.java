package Placement_training;

import java.util.Scanner;

class queuearr{
	int rear=0;
	int front=0;
	int size=100;
	int arr[]=new int[size];

	void enqueue(int ele) {
		arr[rear++]=ele;
	}

	void display()
	{
		if(front==0 && rear==0) {
		return;
		}
		else {
			for(int i=front;i<rear;i++) {
			System.out.println(arr[i]+" ");
			}
		}	
	}	
	
	void dequeue() {
		++front;
	}
	boolean isempty() {
		if(rear == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isfull() {
		if(rear == size - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int peek() {
		if(front == -1) {
			return -1;
		}
		else {
			return arr[front];
		}
	}
	
	int max() {
		int max = 0;
		for(int i = front; i <= rear; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	int min() {
		int min = arr[front];
		for(int i = front; i <= rear; i++) {
			if(arr[i] < min) {
				min = arr[i];
				}
			
		}
			return min;
		}
	}
	


public class Queue {

	public static void main(String[] args) {
		queuearr st=new queuearr();
		Scanner in = new Scanner(System.in);			
		int n;
		int ele;
		do {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.check if empty");
			System.out.println("4.check if full");
			System.out.println("5.print peek of the queue");
			System.out.println("6.Display");
			System.out.println("7.Max of queue");
			System.out.println("8.Min of queue");
			System.out.println("9.quit");	
			System.out.println("Enter your choice : ");
			n = in.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("Enter a element to EnQueue : ");
				ele = in.nextInt();
				st.enqueue(ele);
				System.out.println("\n");
				break;
			case 2:
				st.dequeue();
				System.out.println("an element is deQueued");
				System.out.println("\n");
				break;
			case 3:
				boolean isempty = st.isempty();
				if(isempty == true) {
					System.out.println("Queue is empty");
					System.out.println("\n");
				}
				else {
					System.out.println("Queue is not empty");
					System.out.println("\n");
				}
				break;
			case 4:
				boolean isfull = st.isfull();
				if(isfull == true) {
					System.out.println("Queue is full");
					System.out.println("\n");
				}
				else {
					System.out.println("Queue is not full");
					System.out.println("\n");
				}
				break;
			case 5:
				int peek = st.peek();
				System.out.println("Peek of the Queue is "+ peek);
				System.out.println("\n");
				break;
			case 6:
				System.out.println("Queue is Displayed\n");
				st.display();
				System.out.println("\n");
				break;
			case 7:
				int max = st.max();
				System.out.println("max of the Queue is "+ max);
				System.out.println("\n");
				break;
			case 8:
				int min = st.min();
				System.out.println("min of the Queue is "+ min);
				System.out.println("\n");
				break;
			case 9:
				System.out.println("Execution of program is stopped ");
				System.out.println("\n");
				break;	
			default:
				System.out.println("Enter a valid choice");
				System.out.println("\n");
				break;
			}
			
		}while(n != 9);
		in.close();
		
	}

}