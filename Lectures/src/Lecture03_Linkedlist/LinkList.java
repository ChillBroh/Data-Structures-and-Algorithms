package Lecture03_Linkedlist;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}
	 public boolean isEmpty() {
		 return first == null;
	 }
	 
	 public void displayList() {
		 Link current = first;
		 
		 while(current != null) {
			 current.displayLink();
			 current = current.next; 
		 }
	 }
	 public boolean find(int key){
		 Link current = first;
		 
		 while(!(current == null)) {
			 if(current.iData == key) 
				 return true;
			 else 
				 current = current.next;
			 
		 }
		 
		 return false;
	 }
	 
	 public void insertFirst(int id) {
		 Link newLink = new Link(id);
		 newLink.next = first;
		 first = newLink;
	 }
	 
	 public Link deleteFirst() {
		 Link temp = first;
		 first = first.next;
		 return temp;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
