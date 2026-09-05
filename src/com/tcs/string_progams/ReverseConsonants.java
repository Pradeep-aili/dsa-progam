package com.tcs.string_progams;

import java.util.Scanner;

public class ReverseConsonants {

	static boolean isVowels(char ch)
	{
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string to reverse only vowels : ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			while(i<j && isVowels(ch[i]))
			{
				i++;
			}
			while(i<j && isVowels(ch[j]))
			{
				j--;
			}
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j]=temp;
			i++;j--;
		}
		System.out.println("The result is : "+new String(ch));
	}
}
