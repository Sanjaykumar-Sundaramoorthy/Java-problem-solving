package Placement_training;

import java.util.Scanner;


class Node{
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	
	Node front;
	Node temp;
	
	void enqueue(int ele) {
		Node n=new Node(ele);
		if(front == null) {
			front = n;
			temp = n;
		}
		else {
			temp.next=n;
            temp=n;
		}
	}

	void display()
	{
		Node t = front;
        while(t!=null){
        System.out.println(t.data);
        t = t.next;	
        }
	}	
	
	void dequeue() {
		front = front.next;
	}
	boolean isempty() {
		if(front == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int peek() {
		if(front == null) {
			return -1;
		}
		else {
			return front.data;
		}
	}
}
	


public class linked_queue {

	public static void main(String[] args) {
		queuearr st=new queuearr();
		Scanner in = new Scanner(System.in);			
		int n;
		int ele;
		do {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.check if empty");
			System.out.println("4.print peek of the queue");
			System.out.println("5.Display");
			System.out.println("6.quit");	
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
				int peek = st.peek();
				System.out.println("Peek of the Queue is "+ peek);
				System.out.println("\n");
				break;
			case 5:
				System.out.println("Queue is Displayed\n");
				st.display();
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