package com.gentech.Inheritance;

class oneDigitnum
{
	void Onenum(int num)
	{
	if(num>=1 && num<10)
	{ 
		System.out.println("One digit number:"+num);
	}
		
	}
}
class TwoDigitnum extends oneDigitnum
{
	void twonum(int num)
	{
	if(num>=10 && num<100)
	{ 
		System.out.println("Two digit number:"+num);
	}
		
	}
}
class ThreeDigitnum extends oneDigitnum
{
	void threenum(int num)
	{
	if(num>=100 && num<1000)
	{ 
		System.out.println("Three digit number:"+num);
	}
		
	}
}
public class HierarchicalInheritence {

	public static void main(String[] args) {
		TwoDigitnum t=new TwoDigitnum();
		ThreeDigitnum f=new ThreeDigitnum();
		t.Onenum(5);
		t.twonum(56);
		f.Onenum(8);
		f.threenum(568);	
	}

}
