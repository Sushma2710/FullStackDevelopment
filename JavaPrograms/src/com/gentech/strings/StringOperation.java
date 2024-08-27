package com.gentech.strings;

public class StringOperation {

	public static void main(String[] args) {

		//		getCharCount();
		//		validateString();
		//		getCharBasedOnPosition();
		//		upperCase();
		//		lowerCase();
		//		replaceDemo();
		//		compareString();
		//		compareString2();
		//		existenceString();
		//		extraString();
		//		convertToCharArray();
		//		SplitString();
		//		convertToString();
		convertToByteArray();
	}

	static void getCharCount()
	{
		String s="java";
		int v1=s.length();
		System.out.println(v1);
	}
	static void validateString()
	{
		String s="java";
		boolean v1=s.isEmpty();
		System.out.println(v1);
	}
	static void getCharBasedOnPosition()
	{
		String s= new String("welcome");
		char ch = s.charAt(2);
		System.out.println(ch);
	}
	static void upperCase()
	{
		String s= new String("welcome");
		String v1 = s.toUpperCase();
		System.out.println(v1);
	}
	static void lowerCase()
	{
		String s= new String("WELCOME");
		String v1 = s.toLowerCase();
		System.out.println(v1);
	}
	static void replaceDemo()
	{
		String s= new String("My village is Huliyurdurga");
		String v1 = s.replace("Huliyurdurga","Hangarahalli");
		System.out.println(v1);
	}
	static void compareString()
	{
		String s1="welcome";
		String s2= new String("WELCOME");
		boolean v1 = s1.equals(s2);
		System.out.println(v1);
		boolean v2 = s1.equalsIgnoreCase(s2);
		System.out.println(v2);
	}
	static void compareString2()
	{
		String s1="welcome";
		String s2= new String("WELCOME");
		int v1 = s1.compareTo(s2);
		System.out.println(v1);
		int v2 = s1.compareToIgnoreCase(s2);
		System.out.println(v2);
	}
	static void existenceString()
	{
		String s= new String("My village is Huliyurdurga");
		boolean v1 = s.startsWith("my");
		System.out.println(v1);
		boolean v2 = s.endsWith("Huliyurdurga");
		System.out.println(v2);
		boolean v3 = s.contains("village");
		System.out.println(v3);
	}
	static void extraString()
	{
		String s= new String("Programming");
		String v1 = s.substring(3);
		System.out.println(v1);
		String v2 = s.substring(3,7);
		System.out.println(v2);
	}
	static void convertToCharArray()
	{
		String s= new String("Software App");
		char ch[]= s.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk);
		}
	}
	static void SplitString()
	{
		//		String s= "Apple,Mango,Orange,Banana";
		//		String v1[] = s.split(",");
		//		 for(String kk:v1)
		//		    {
		//		    	System.out.println(kk);
		//		    }

		String s1= "Apple/Mango/Orange/Banana";
		String v[] = s1.split("/");
		for(String kk:v)
		{
			System.out.println(kk);
		}
	}
	static void convertToString()
	{
		double d=10.33;
		String s= String.valueOf(d);
		System.out.println(s);
		int a=10;
		String s1= String.valueOf(a);
		System.out.println(s1);
	}
	static void convertToByteArray()
	{
		String str = "welcome to gentech";
		byte b[]=str.getBytes();
		for(int kk:b)
		{
			System.out.println(kk);
		}
	}


	}
