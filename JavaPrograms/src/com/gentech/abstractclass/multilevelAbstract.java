package com.gentech.abstractclass;


abstract class OneNumber
{
	abstract void onenum(int num);
	
}
class TwoExtends extends OneNumber
{
 
	void onenum(int num)
	{
		if(num>1 && num<10)
		{
			System.out.println(" Single Digit number: " +num);
		}
	}
}
class ThreeExtends extends TwoExtends
{
	void Twonum(int num)
	{
		if(num>=10 && num<100)
		{
			System.out.println(" Two Digit number: " +num);
		}
	}
	void Threenum(int num)
	{
		if(num>=100 && num<1000)
		{
			System.out.println(" Three Digit number: " +num);
		}
	}
}



public class multilevelAbstract {

	public static void main(String[] args) {
		ThreeExtends t = new ThreeExtends();
		t.Threenum(100);
		

	}

}
