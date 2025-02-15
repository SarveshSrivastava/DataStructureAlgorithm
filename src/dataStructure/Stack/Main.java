package dataStructure.Stack;

public class Main {

	public static void main(String[] args) {
		Stack s = new Stack(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.printStack();
		s.getTop();
		s.getHeight();
		System.out.println("POP : " + s.pop().value);
		s.printStack();
		s.getTop();
		s.getHeight();
		System.out.println("PEEK : " + (s.peek() != null ? s.peek().value : null));
	}

}
