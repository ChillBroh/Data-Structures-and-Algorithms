package Lecture03_Linkedlist;

public class Main {
	 public static void main(String[] args) {
		Link L1 = new Link(20);
		Link L2 = new Link(20);
		Link L3 = new Link(40);
		
		L1.next = L2; //give reference to L2
		L2.next = L3; //give reference to L3
		
		
	}
}
 