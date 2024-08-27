package com.gentech.Inheritance;

class Addition
{
	void Arith(int x,int y)
	{
	    System.out.println("Addition result:" +(x+y));
	}
}
class multiplication extends Addition
{
	multiplication()
	{
	    super.Arith(12,34);
	}
	void Arith(int x,int y)
	{
		System.out.println("Multiplication result:" +(x*y));
	}
}
	

class subtraction extends multiplication
{
	subtraction()
	{
		super.Arith(45,26);
	}
	void Arith(int x,int y)
	{
		System.out.println("Subtraction result:" +(x-y));
	}
}
	
public class SameMethodMultilevel {

	public static void main(String[] args) {
		
		subtraction s=new subtraction();
		

	}

}
