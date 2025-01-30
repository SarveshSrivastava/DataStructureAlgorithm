package dataStructureAlgorithm.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printItemsInQueue();
		queue.getFirst();
		queue.getLast();
		queue.getLength();
		System.out.println("dequeue : " + queue.dequeue().value);
		System.out.println("dequeue : " + queue.dequeue().value);
		System.out.println("dequeue : " + queue.dequeue().value);
		queue.printItemsInQueue();
		queue.getFirst();
		queue.getLast();
		queue.getLength();
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.printItemsInQueue();
		queue.getFirst();
		queue.getLast();
		queue.getLength();
	}

}
