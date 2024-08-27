package com.gentech.abstractclass;

abstract class Demostatic
{
	static 
	{
		System.out.println("This is 1st static method");
	}
	public static void staticMethod()
	{
        System.out.println("This is a static method in the abstract class");
    }
}
public class statocalone {
	public static void main(String args[])
	{
		Demostatic.staticMethod();
	}
}
