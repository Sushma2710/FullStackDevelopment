package com.gentech.test4;

class First
{
	static String name="Shree";
	static int age=2;
	  
		int a=89;
		int b=10;		
}
class Second extends First
{
	Second()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(a);
		System.out.println(b);
	}
	
}
public class Question_03 {

	public static void main(String[] args) {
		Second o=new Second();

	}

}
