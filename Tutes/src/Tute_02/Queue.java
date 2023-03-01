package Tute_02;

public class Queue {
	private int max_Size;
	private char[] arr;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.max_Size = size;
		this. arr = new char[max_Size];
		this.front = 0; 
		this.rear = -1;
		this.nItems = 0;
		
	}
	
	public void insert(char x) {
		if(nItems == max_Size) {
			System.out.println("Queue is Full");
		}
		else {
			nItems++;
			if(rear == max_Size-1) {
				rear = -1;
			}
			
			arr[++rear] = x;
		}
	}
	
	public char remove() {
		if(nItems == 0) {
			System.out.println("Stack is empty");
			return 'X';
		}
		else {
			nItems--;
			if(front == max_Size-1) {
				front = 0;
			}
			
			return arr[front++];
		}
	}
	
	public char peek() {
		if(nItems == 0 ) {
			System.out.println("Stack is empty");
			return 'X';
		}
		else {
			return arr[front];
		}
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	 public boolean isFull() {
		 return (nItems == max_Size);
	 }
	
	
	
	
	
	
	
}
