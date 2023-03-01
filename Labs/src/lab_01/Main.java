package lab_01;

public class Main {
	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		
		while(!s1.isEmpty()) {
			System.out.println(s1.pop());
		}
		
		//removal order = 5,4,3,2,1
	}
}
