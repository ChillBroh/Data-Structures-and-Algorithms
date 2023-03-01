package Lecture01_Stack;


public class Stack {
	private double[] arr;
	private int max_Size;
	private int top;
	
	public Stack(int size) {
		this.max_Size = size;
		this.arr = new double[max_Size];
		this.top = -1; //no items
	}
	
	public void push(double x) {
		if(top == (max_Size-1)) {
			System.out.println("Stack is full");
		}
		else {
			arr[++top] = x;
		}
	}
	
	public double pop() {
		if(top == -1) {
			return -99;
		}
		else {
			return arr[top--];
		}
	}
	
	public double peek() {
		if(top == -1) {
			return -99;
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
