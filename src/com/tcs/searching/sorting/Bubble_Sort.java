package com.tcs.searching.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter " + size + " elements to sort");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("The sorted element is : "+Arrays.toString(a));
	}
}
