package com.gentech.test4;

class FirststaticMethod
{
	static
	{
		System.out.println("First static Bllock");
	}
	static
	{
		System.out.println("Second static Bllock");
	}
	static
	{
		System.out.println("Third static Bllock");
	}
}
public class Question_05 {

	public static void main(String[] args) {
		FirststaticMethod f=new FirststaticMethod();

	}

}
