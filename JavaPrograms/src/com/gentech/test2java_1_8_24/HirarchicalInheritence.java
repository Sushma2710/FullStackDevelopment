package com.gentech.test2java_1_8_24;
class Maths1
{
	void Add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
}
class Maths2 extends Maths1
{
	void Sub(int x,int y)
	{
		System.out.println("Subtraction is "+(x-y));
	}
}
class Maths3 extends Maths1
{
	void Div(int x,int y)
	{
		System.out.println("Division is "+(x/y));
	}
}
public class HirarchicalInheritence {

	public static void main(String[] args) {
		Maths2 m=new Maths2();
		m.Sub(100,50);
		m.Add(50,50);
		Maths3 o=new Maths3();
		o.Add(40,10);
		o.Div(100, 50);
		

	}

}
