package com.gentech.string.assignment;

public class Question_2charArray {

	public static void main(String[] args) {
		String original="Tailand";
		char c[]=original.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev += c[i];
		}
		System.out.println("reverse String is:" +rev);
	}

	
	}


