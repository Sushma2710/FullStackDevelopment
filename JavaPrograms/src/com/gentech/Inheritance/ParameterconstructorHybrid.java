package com.gentech.Inheritance;
class oneDigitNo
{
	oneDigitNo(int num)
	{
	if(num>=1 && num<10)
	{ 
		System.out.println("One digit number:"+num);
	}
		
	}
}
class TwoDigitNo extends oneDigitNo
{
	TwoDigitNo(int num)
	{
		super(num);
	}
	void twonum(int num)
	{
	if(num>=10 && num<100)
	{ 
		System.out.println("Two digit number:"+num);
	}
		
	}
}
class ThreeDigitNo extends oneDigitNo
{
	ThreeDigitNo(int num)
	{
		super(num);
	}
	void threenum(int num)
	{
	if(num>=100 && num<1000)
	{ 
		System.out.println("Three digit number:"+num);
	}
		
	}
}
class fourDigitNo extends ThreeDigitNo
{
	fourDigitNo(int num)
	{
		super(num);
	}
	void fournum(int num)
	{
	if(num>=1000 && num<10000)
	{ 
		System.out.println("four digit number:"+num);
	}
		
	}
}
public class ParameterconstructorHybrid {

	public static void main(String[] args) {
		
		TwoDigit t=new TwoDigit();
		fourDigit f = new fourDigit();
		t.Onenum(5);
		t.twonum(26);
		f.threenum(256);
		f.fournum(2568);


	}

}
