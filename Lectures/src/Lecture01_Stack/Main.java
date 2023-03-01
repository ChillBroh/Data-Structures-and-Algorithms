package Lecture01_Stack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size for the stack : ");
		int size =sc.nextInt();
		
		Stack ob1 = new Stack(size);
		ob1.push(10);
		ob1.push(20);
		ob1.push(30);
		
		System.out.println(ob1.isEmpty());
		System.out.println(ob1.isFull());
		
		while(!ob1.isEmpty()) {
			System.out.println("Removing " + ob1.pop());
		}
		
		System.out.println(ob1.isEmpty());
		System.out.println(ob1.isFull());
		
		ob1.valueOfTop();
		
		
	}
}
