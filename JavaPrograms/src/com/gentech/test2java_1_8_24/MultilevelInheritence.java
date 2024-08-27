package com.gentech.test2java_1_8_24;

class AdditionN
{
	void Add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
}
class SubtractionN extends AdditionN
{
	void Sub(int x,int y)
	{
		System.out.println("Subtraction is "+(x-y));
	}
}
class Division extends SubtractionN
{
	void Div(int x,int y)
	{
		System.out.println("Division is "+(x/y));
	}
}

public class MultilevelInheritence {
	public static void main(String args[])
	{
		Division d= new Division();
		d.Add(15,36);
		d.Sub(36,6);
		d.Div(15, 3);
	}

}
