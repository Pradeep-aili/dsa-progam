package com.tcs.searching;

import java.util.Scanner;

class Search_Element {
	static void search(int[] arr, int searchValue) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				System.out.print("\nElement found at index : " + i);
				return;
			}
		}
		System.out.print("\nElement not found : " + searchValue);
	}
}

public class linear_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.print("Enter " + size + " elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("\nEnter the element to search form the given array ");
		int searchValue = sc.nextInt();
		Search_Element.search(arr, searchValue);
	}
}
