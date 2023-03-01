package Lecture02_Queue;


public class CircularQueue {
	private int max_Size;
	private int [] array;
	private int front;
	private int rear;
	private int nItems;
	
	public CircularQueue(int size) {
		this.max_Size = size;
		this.array = new int[max_Size];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	public void insert(int i) {
		if(nItems == max_Size) {
			System.out.println("Queue is Full");
		}
		else {
			nItems++;
			if(rear == max_Size -1) {
				rear = -1;
			}
			
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
			int value = array[front++];
			if(front == max_Size -1) {
				front =0;
			}
			return value;
			
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
		return (nItems == max_Size);
	}
}
