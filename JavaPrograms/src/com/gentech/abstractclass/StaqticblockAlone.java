package com.gentech.abstractclass;

abstract class Demo
{
	static void method1()
	{
		System.out.println("This is 1st static method");
	}
	static void method2()
	{
		System.out.println("This is 2nd static method");
	}
	static void method3()
	{
		System.out.println("This is 3nd static method");
	}
	static void method4()
	{
		System.out.println("This is 4nd static method");
	}
	
}
public class StaqticblockAlone {

	public static void main(String[] args) {
		Demo.method1();
		Demo.method2();
		Demo.method3();
		Demo.method4();

	}

}
