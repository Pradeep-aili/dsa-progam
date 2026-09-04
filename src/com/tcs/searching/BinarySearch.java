package com.tcs.searching;



public class BinarySearch {

	static void search(int[] arr, int searchValue)
	{
		int li=0, hi = arr.length-1;
		while (li<=hi) {
			int mid=(li+hi)/2;
			if(arr[mid] == searchValue)
			{
				System.out.println("element found at index : "+mid);
				return;
			}
			if(searchValue > mid)
			{
				li = mid+1;
			}else {
				hi = mid-1;
			}
		}
		System.out.println("Element not found : "+searchValue);
	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40};
		int searchValue = 20;
		search(arr, searchValue);
	}
}
