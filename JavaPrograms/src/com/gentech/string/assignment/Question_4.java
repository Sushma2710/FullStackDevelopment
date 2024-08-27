package com.gentech.string.assignment;

public class Question_4 {

	public static void main(String[] args) {
		String str="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		//String original=str;
		String result="";

		for(int i=0;i<str.length();i++)
		{
			if (i <= str.length() - 3 && str.substring(i, i + 3).equals("DAY")) 
			{
				result += ","; 
			}
			result += str.charAt(i); 
		}

		System.out.println("Resulting string: " + result);
	}
}

