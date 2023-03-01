package Tute_02;

public class Main {
	public static void main(String[] args) {
		Queue q1 = new Queue(5);
		
		q1.insert('L');
		System.out.println(q1.remove());
		q1.insert('Q');
		q1.insert('P');
		
		q1.insert('R');
		System.out.println(q1.peek());
		q1.insert('S');
		q1.insert('T');
		
		System.out.println(q1.remove());
	}
}
