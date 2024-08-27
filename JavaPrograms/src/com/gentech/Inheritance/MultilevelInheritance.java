package com.gentech.Inheritance;

class OneNumber
{
	void onenum(int num)
	{
		if(num>1 && num<10)
		{
			System.out.println(" Single Digit number: " +num);
		}
	}
}
class TwoExtends extends OneNumber
{
	void Twonum(int num)
	{
		if(num>=10 && num<100)
		{
			System.out.println(" Two Digit number: " +num);
		}
	}
}
class ThreeExtends extends TwoExtends
{
	void Threenum(int num)
	{
		if(num>=100 && num<1000)
		{
			System.out.println(" Three Digit number: " +num);
		}
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		ThreeExtends t = new ThreeExtends();
		t.Threenum(100);
		t.Twonum(59);
		t.onenum(6);

	}

}
