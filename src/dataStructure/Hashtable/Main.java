package dataStructure.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hashTable = new HashTable();
//		hashTable.printHashTableElements();
		hashTable.set("nails", 1000);
		hashTable.set("bolts", 2000);
		hashTable.set("screws", 5000);
		hashTable.set("lomber", 2300);
		hashTable.set("nuts", 6000);
		hashTable.set("nails", 1400);
		hashTable.set("nuts", 9000);
		hashTable.set("nails", 400);
		hashTable.printHashTableElements();
	}

}
