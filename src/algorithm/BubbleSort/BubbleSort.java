package algorithm.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 4, 1, 3, 5, 2 };
		System.out.println(Arrays.toString(arr));
		BubbleSort bsAlgo=new BubbleSort();
		bsAlgo.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
