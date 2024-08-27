package com.gentech.Inheritance;

class oneDigit
{
	void Onenum(int num)
	{
	if(num>=1 && num<10)
	{ 
		System.out.println("One digit number:"+num);
	}
		
	}
}
class TwoDigit extends oneDigit
{
	void twonum(int num)
	{
	if(num>=10 && num<100)
	{ 
		System.out.println("Two digit number:"+num);
	}
		
	}
}
class ThreeDigit extends oneDigit
{
	void threenum(int num)
	{
	if(num>=100 && num<1000)
	{ 
		System.out.println("Three digit number:"+num);
	}
		
	}
}
class fourDigit extends ThreeDigit
{
	void fournum(int num)
	{
	if(num>=1000 && num<10000)
	{ 
		System.out.println("four digit number:"+num);
	}
		
	}
}
public class HybridInheritance {

	public static void main(String[] args)
	{
		TwoDigit t=new TwoDigit();
		fourDigit f = new fourDigit();
		t.Onenum(5);
		t.twonum(26);
		f.threenum(256);
		f.fournum(2568);

	}

}
