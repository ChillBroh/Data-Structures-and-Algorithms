package Lecture03_Linkedlist;

public class QLink {
	public int iData;
	public QLink next;
	
	public QLink(int val) {
		iData = val;
		next= null;
	}
	public void displayLink() {
		System.out.println(iData);
	}
}
