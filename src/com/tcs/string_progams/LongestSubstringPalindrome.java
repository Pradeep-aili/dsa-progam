package com.tcs.string_progams;

import java.util.Scanner;

public class LongestSubstringPalindrome {

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String word = "";
		int max = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				String temp = str.substring(i, j);
				if (isPalindrome(temp) && temp.length() > max) {
					max = temp.length();
					word = temp;
				}
			}
		}
		System.out.println("The longest substring palindrome is : " + word + " and length is : " + max);
	}
}
