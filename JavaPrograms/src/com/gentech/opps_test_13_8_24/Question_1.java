package com.gentech.opps_test_13_8_24;

class maths1
{
	maths1(int x,int y)
	{
		System.out.println("Addition result:" +(x+y));
	}
}
class maths2 extends maths1
{
	maths2(int x,int y)
	{
		super(5,40);
		System.out.println("Subtraction result:" +(x-y));
	}
}
class maths3 extends maths2
{
	maths3(int x,int y)
	{
		super(5,18);
		System.out.println("multiplication result:" +(x*y));
	}
}

public class Question_1 {

	public static void main(String[] args) {
		maths3 m=new maths3(7,15);
		

	}

}
