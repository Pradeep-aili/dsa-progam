package com.tcs.searching.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {

	static void sorting(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			int currentMin = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[currentMin])
				{
					currentMin = j;
				}
				int temp = arr[i];
				arr[i] = arr[currentMin];
				arr[currentMin] = temp;
			}
		}
		System.out.println("The sorted array is : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter " + size + " elements to sort");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		
		sorting(a);
	}
}
