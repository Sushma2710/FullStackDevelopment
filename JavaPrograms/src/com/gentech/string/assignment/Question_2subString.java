package com.gentech.string.assignment;

public class Question_2subString {

	public static void main(String[] args) {
		String original="Tailand";
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
			rev+=original.substring(i,i+1);
		}

		System.out.println("Reverse of String is:" +rev);

	}

}


