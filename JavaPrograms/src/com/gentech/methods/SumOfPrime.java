package com.gentech.methods;

class Sumprime
{
	void sumNum()
	{
		int Sum=0;
		System.out.println("Sum of numbers is:");
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i))
			{
			Sum=Sum+i;
			}
		}
		System.out.println(Sum);
	}
	boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int j=2;j<=Math.sqrt(num);j++)
		{
			if(num % j==0)
			{
				return false;
			}
		}
		return true;
	}
}

public class SumOfPrime {

	public static void main(String[] args) {
		Sumprime s=new Sumprime();
		s.sumNum();
		
	}

}
