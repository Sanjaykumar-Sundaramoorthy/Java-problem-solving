package Placement_training;

class linked_node{
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data=d;
            next=null;
        }
    }
        Node temp;
        Node head;
        void insert(int d){
            Node n=new Node(d);
            if(head==null){
                head=n;
                temp=n;
            }
            else{
                temp.next=n;
                temp=n;
            }
            
        }
        void insertBeforeHead(int d) 
        {
            Node n = new Node(d);
            if (head == null) {
                head = n;
               
            } else {
                n.next = head;
                head = n;
            }
        }
        
        void insertmiddle(int p,int d) 
        {
            temp = head;
            for(int i=0;i<p-1;i++) {
                temp = temp.next;
            }
            Node n = new Node(d);
            n.next = temp.next;
            temp.next =n;
        }
        
        
        void insertatend(int d)
        {
            Node n = new Node(d);
            temp = head;
            while(temp.next!=null) 
            {
                temp = temp.next;
            }
            temp.next = n;
            
        }
        public void findMax() {
            if (head == null) {
                System.out.println("Linked list is empty");
                return;
            }

            int max = head.data;
            Node current = head.next;

            while (current != null) {
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }

            System.out.println("Maximum value in the linked list: " + max);
        
        
        
        }
        void print()
        {
            Node t = head;
            while(t!=null){
            System.out.println(t.data);
            t = t.next;
            }
        }

 	public void findMin() {
 		 int min = head.data;
 	        Node current = head;

 	        while (current.next != null) {
 	            current = current.next;
 	            if (current.data < min) {
 	                min = current.data;
 	            }
 	        }

 	        System.out.println("Minimum value in linked list: " + min);

 		
 	}
    
}


public class linked_list{
    public static void main(String args[]){
        linked_node l=new linked_node();
        for(int i=1;i<=5;i++){
            
                l.insert(i);
                
            }
        l.print();    
        }
    }