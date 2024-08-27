package com.gentech.methods.returnType;
class FactNum
{
	int factorial()
	{
		int fact=1;
		//int s;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Factorial {

	public static void main(String[] args) {
		FactNum f = new FactNum();
		f.factorial();
		System.out.println("factorial of a number is:" +f.factorial());

	}

}
