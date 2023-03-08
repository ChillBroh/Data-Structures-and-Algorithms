package Lecture03_Linkedlist;

public class Link {
	public int iData; //data item
	public Link next; //Reference to the next link
	
	public Link(int id) {
		iData = id;
		next = null; //Not connected to anywhere so it is null 
	}
	public void displayLink() {
		System.out.println(iData);
	}
}
