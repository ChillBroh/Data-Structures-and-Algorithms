package Lecture02_Queue;

public class Main {
	public static void main(String[] args) {
		Queue q1 = new Queue(4);
		System.out.println(q1.isEmpty());
		System.out.println(q1.isFull());
		
		q1.insert(1);
		q1.insert(2);
		q1.insert(3);
		q1.insert(4);
		
		System.out.println(q1.isEmpty());
		System.out.println(q1.isFull());
		
		while(!q1.isEmpty()) {
			System.out.println(q1.remove());
		}
		
		System.out.println(q1.isEmpty());
		System.out.println(q1.isFull());
		
		System.out.println("******Circlar Queue*******");
		CircularQueue q2 = new CircularQueue(10);
		System.out.println(q2.isEmpty());
		System.out.println(q2.isFull());
		
		q2.insert(0);
		q2.insert(1);
		q2.insert(2);
		q2.insert(3);
		q2.insert(4);
		q2.insert(5);
		q2.insert(6);
		q2.insert(7);
		q2.insert(8);
		q2.insert(9);
		
		System.out.println(q2.isEmpty());
		System.out.println(q2.isFull());
		
		q2.insert(10);
	
		System.out.println(q2.peek());
		
		System.out.println(q2.remove()); //front will move to the next index
		System.out.println(q2.isEmpty());
		System.out.println(q2.isFull());
		
		q2.insert(10);
		
		System.out.println(q2.isEmpty());
		System.out.println(q2.isFull());
		
		System.out.println(q2.peek());

		
	
	
	}
}
