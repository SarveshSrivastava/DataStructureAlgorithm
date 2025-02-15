package algorithm.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j > -1 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 3, 1, 2, 6, 5 };
		System.out.println(Arrays.toString(arr));
		InsertionSort isAlgo = new InsertionSort();
		isAlgo.insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
