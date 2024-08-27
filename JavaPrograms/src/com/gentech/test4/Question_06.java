package com.gentech.test4;

class test1
{
	static
	{
		System.out.println("This is First static block");
	}
}

class test2 extends test1
{
	static
	{
		System.out.println("This is Second static block");
	}
}
public class Question_06 {

	public static void main(String[] args) {
		test2 t=new test2();

	}

}
