package com.tcs.string_progams;

public class SentenceReverse {

	public static void main(String[] args) {
		String str = "I LOVE INDIA";
		String rep = str.replaceAll("[^A-Za-z]", "");
		String rev="";
		for (int i = 0; i < rep.length(); i++) {
			rev=rep.charAt(i)+rev;
		}
		
		String res="";
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == ' ')
			{
				res+=" ";
			}else {
				res+=rev.charAt(index);
				index++;
			}
		}
		System.out.println("The result is : "+res);
	}
}
