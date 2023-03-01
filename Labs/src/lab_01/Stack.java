package lab_01;

public class Stack {
	private int max_size;
	private int [] array;
	private int top;
	
	public Stack(int size) {
		this.max_size = size;
		this.array = new int[max_size];
		this.top = -1;
		
	}
	
	public void push(int j) {
		if(top == max_size -1) {
			System.out.println("Stack is Full");
		}
		else {
			array[++top] = j;
		}
	}
	
	public int pop() {
		if(top == -1) {
			return 'X';
		}
		else {
			return array[top--];
		}
	}
	
	public int peek() {
		if(top == -1) {
			return 'X';
		}
		else {
			return array[top];
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (max_size -1));
	}
	
	public void valueOfTop() {
		System.out.println(top);
	}
}
