package Lecture02_Queue;

public class Queue {
	private int max_Size;
	private int [] array;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.max_Size = size;
		this.array = new int[max_Size];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(int i) {
		if(rear == max_Size - 1) {
			System.out.println("Queue is Full");
		}
		else {
			nItems++;
			array[++rear] = i;
		}
	}
	
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			nItems--;
			return array[front++];
		}
	}
	
	public int peek() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}
		else {
			return array[front];
		}
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	public boolean isFull() {
		return (rear == max_Size-1);
	}
}
