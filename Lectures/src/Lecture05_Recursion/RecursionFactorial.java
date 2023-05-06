package Lecture05_Recursion;

import java.util.Scanner;

public class RecursionFactorial {
	public static int factorial(int n) {
		if(n==0) 
			return 1;
		else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int n = scan.nextInt();
		
		System.out.println(factorial(n));
		
		scan.close();
	}

}
