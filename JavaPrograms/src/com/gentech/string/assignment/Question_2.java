package com.gentech.string.assignment;

public class Question_2 {

	public static void main(String[] args) {
		String original="Tailand";
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		
		System.out.println("Reverse of String is:" +rev);

	}

}
