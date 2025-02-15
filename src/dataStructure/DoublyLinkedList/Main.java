package dataStructure.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
//		prepend
		dll.prepend(9);
		dll.prepend(8);
		dll.prepend(7);
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
//		removeLast
		System.out.println(dll.removeLast().value);
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
//		removeFirst
		System.out.println(dll.removeFirst().value);
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
//		get
		System.out.println(dll.get(0).value);
		System.out.println(dll.get(6));
		System.out.println(dll.get(5).value);
		System.out.println(dll.get(3).value);
		System.out.println(dll.get(2).value);
		System.out.println(dll.get(4).value);
		System.out.println(dll.get(1).value);
//		set
		System.out.println(dll.set(0, 0));
		System.out.println(dll.set(6, 6));
		System.out.println(dll.set(5, 5));
		System.out.println(dll.set(3, 3));
		System.out.println(dll.set(2, 2));
		System.out.println(dll.set(4, 4));
		System.out.println(dll.set(1, 1));
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
//		insert
		System.out.println(dll.insert(3, 22));
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
//		remove
		System.out.println(dll.remove(0).value);
		dll.printList();
		dll.getHead();
		dll.getTail();
		dll.getLength();
		
	}

}
