package com.gentech.test2java_1_8_24;

class Addition
{
	void Add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
}
class Subtraction extends Addition
{
	void Sub(int x,int y)
	{
		System.out.println("Subtraction is "+(x-y));
	}
}
public class SingleInheritence {

	public static void main(String[] args) {
		Subtraction o=new Subtraction();
	    o.Add(15,36);
		o.Sub(36,6);
		//System.out.println(v1);
		//System.out.println(v2);

	}

}
