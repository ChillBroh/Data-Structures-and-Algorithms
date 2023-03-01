package Tute_01;

public class Stack {
	private char[] arr;
	private int max_Size;
	private int top;
	
	public Stack(int size) {
		this.max_Size = size;
		this.arr = new char[max_Size];
		this.top = -1; //no items
	}
	
	public void push(char x) {
		if(top == (max_Size-1)) {
			System.out.println("Stack is full");
		}
		else {
			arr[++top] = x;
		}
	}
	
	public char pop() {
		if(top == -1) {
			return 'X';
		}
		else {
			return arr[top--];
		}
	}
	
	public char peek() {
		if(top == -1) {
			return 'X';
		}
		else {
			return arr[top];
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (max_Size -1));
	}
	
	public void valueOfTop() {
		System.out.println(top);
	}
}
