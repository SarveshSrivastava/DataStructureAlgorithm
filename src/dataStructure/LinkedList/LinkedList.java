package dataStructure.LinkedList;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("null\n");
	}

	public void getHead() {
		System.out.println("Head : " + (head != null ? head.value : "null"));
	}

	public void getTail() {
		System.out.println("Tail : " + (tail != null ? tail.value : "null"));
	}

	public void getLength() {
		System.out.println("Length : " + length);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		Node prev = head;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		tail = prev;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int value) {
		Node newNode = new Node(value);
		if (index < 0 || index > length) {
			return false;
		}
		if (index == 0) {
			prepend(value);
		} else if (index == length) {
			append(value);
		} else {
			Node temp = get(index - 1);
			newNode.next = temp.next;
			temp.next = newNode;
			length++;
		}
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		} else if (index == length - 1) {
			return removeLast();
		} else {
			Node prev = get(index - 1);
			Node temp = prev.next;
			prev.next = temp.next;
			temp.next = null;
			length--;
			return temp;
		}
	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node before = null;
		Node after = temp;
		while (temp != null) {
			after = after.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}

//	alternate way
	public void reverseInVideo() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
}