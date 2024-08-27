package com.gentech.polymorphism;


abstract class PlusSymbol
{
	abstract void Plus();
}

class Addition extends PlusSymbol
{
	void Plus()
	{
		int a=18;
		int b=20;
		System.out.println("Addition of number:"+(a+b));
	}
}
class Concatenation extends PlusSymbol
{
	void Plus()
	{
		String a="Shree";
		String b="Rama";
		System.out.println("Addition of number:"+(a+b));
	}
}
public class Polymorphism_05 {

	public static void main(String[] args) {
		
		PlusSymbol varities=null;
		
		Addition a=new Addition();
		Concatenation c=new Concatenation();
		
		varities=a;
		varities.Plus();
		
		varities=c;
		varities.Plus();
		
		
		
	}

}
