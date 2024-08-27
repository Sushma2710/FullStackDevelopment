package com.gentech.test2java_1_8_24;
class Maths11
{
	void Add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
}
class Maths22 extends Maths11
{
	void Sub(int x,int y)
	{
		System.out.println("Subtraction is "+(x-y));
	}
}
class Maths33 extends Maths11
{
	void Div(int x,int y)
	{
		System.out.println("Division is "+(x/y));
	}
}
class Maths4 extends Maths33
{
	void Mul(int x,int y)
	{
		System.out.println("Division is "+(x*y));
	}
}
public class HybridInheritence {

	public static void main(String[] args) {
		Maths22 o=new Maths22();
		o.Add(10,20);
		o.Sub(30, 10);
		Maths4 o1=new Maths4();
		o1.Div(22, 2);
		o1.Mul(2, 2);

	}

}
