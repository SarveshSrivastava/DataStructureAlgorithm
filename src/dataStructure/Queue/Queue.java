package dataStructure.Queue;

public class Queue {

	private Node first;
	private Node last;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}

	public void printItemsInQueue() {
		Node temp = first;
		while (temp != null) {
			System.out.print(temp.value + " <- ");
			temp = temp.next;
		}
		System.out.print("null\n");
	}

	public void getFirst() {
		System.out.println("First Item in Queue : " + (first != null ? first.value : null));
	}

	public void getLast() {
		System.out.println("Last Item in Queue : " + (last != null ? last.value : null));
	}

	public void getLength() {
		System.out.println("Length of Queue : " + length);
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}

	public Node dequeue() {
		if (length == 0) {
			return null;
		}
		Node temp = first;
		if (length == 1) {
			first = null;
			last = null;
		} else {
			first = first.next;
			temp.next = null;
		}
		length--;
		return temp;
	}
}
