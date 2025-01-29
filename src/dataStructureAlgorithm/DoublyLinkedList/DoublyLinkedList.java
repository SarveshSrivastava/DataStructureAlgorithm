package dataStructureAlgorithm.DoublyLinkedList;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		System.out.print("null <-");
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			if (temp.next != null) {
				System.out.print(" <- ");
			} else {
				System.out.print("null\n");
			}
			temp = temp.next;
		}
		System.out.println();
	}

	public void getHead() {
		System.out.println("Head : " + (head != null ? head.value : null));
	}

	public void getTail() {
		System.out.println("Tail : " + (tail != null ? tail.value : null));
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
			newNode.prev = tail;
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
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		if (index < length / 2) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
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
		if (index < 0 || index > length) {
			return false;
		}
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == length) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev=temp;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		if (index == length - 1) {
			return removeLast();
		}
		Node temp = get(index);
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.prev = null;
		temp.next = null;
		length--;
		return temp;
	}
}
