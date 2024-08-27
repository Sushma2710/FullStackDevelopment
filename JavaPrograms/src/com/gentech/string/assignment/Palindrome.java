package com.gentech.string.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str="Sushma";
		String original=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(original))
		{
			System.out.println("palindrome String:" +rev);
		}
		else
		{
			System.out.println("Not palindrome String:"+rev);
		}

	}

}
