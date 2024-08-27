package com.gentech.methods;
class sum
{
	void eachDigit(int num)
	{
		int sum=0;
		while(num !=0)
		{
			sum=sum+(num%10);
			num =num/10;
		}
		System.out.println(sum);
	}
}

public class SumofEachDigit {

	public static void main(String[] args) {
		sum s=new sum();
		s.eachDigit(12345);
		
	}

}
