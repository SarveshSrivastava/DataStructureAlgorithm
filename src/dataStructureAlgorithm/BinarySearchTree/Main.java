package dataStructureAlgorithm.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
		System.out.println(bst.insert(47));
		System.out.println(bst.insert(21));
		System.out.println(bst.insert(76));
		System.out.println(bst.insert(18));
		System.out.println(bst.insert(27));
		System.out.println(bst.insert(52));
		System.out.println(bst.insert(91));
		System.out.println(bst.insert(27));

		System.out.println(bst.root.value);
		System.out.println(bst.root.left.value);
		System.out.println(bst.root.right.value);
		System.out.println(bst.root.left.left.value);
		System.out.println(bst.root.left.right.value);
		System.out.println(bst.root.right.left.value);
		System.out.println(bst.root.right.right.value);
		System.out.println(bst.root.right.right.right);
		System.out.println(bst.root.right.right.left);

		System.out.println(bst.contains(47));
		System.out.println(bst.contains(91));
		System.out.println(bst.contains(76));
		System.out.println(bst.contains(52));
		System.out.println(bst.contains(27));
		System.out.println(bst.contains(18));
		System.out.println(bst.contains(21));
		System.out.println(bst.contains(20));

	}

}
