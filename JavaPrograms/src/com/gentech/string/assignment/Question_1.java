package com.gentech.string.assignment;

public class Question_1 {

	public static void main(String[] args) {
		String s="welcome";
	    //int v1 = s.length();
		int count=0;
		
		for(char kk:s.toCharArray())
		{
			count++;
		}
      System.out.println("count of charecter is:"+count);
	}

}
