package Lecture03_Linkedlist;

public class QLinkList {
	private QLink first;
	
	public QLinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	public void displayList() {
		QLink current = first;
		 while(current != null) {
			 current.displayLink();
			 current = current.next;
		 }
	}
	public void insertFirst(int val) {
		QLink newLink = new QLink(val);
		newLink.next = first;
		first = newLink;
	}
	
	public QLink deleteFirst() {
		QLink temp = first;
		first = first.next;
		return temp;
	}
}
