package com.tcs.searching.sorting;

import java.util.Arrays;

public class Quick_Sort {

	public static int getPivote(int[] arr, int li, int hi) {
		int pivote = hi;
		int j = li - 1;
		for (int i = li; i <= hi; i++) {
			if (arr[i] <= arr[pivote]) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return j;
	}

	public static void quickSort(int[] arr, int li, int hi) {
		if (li < hi) {
			int pivote = getPivote(arr, li, hi);
			quickSort(arr, li, pivote - 1);
			quickSort(arr, pivote + 1, hi);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 1, 9, 5, 6 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
