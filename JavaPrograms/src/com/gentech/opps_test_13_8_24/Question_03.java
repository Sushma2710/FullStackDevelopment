package com.gentech.opps_test_13_8_24;
abstract class test
{
	abstract void FirstName(String fName);
	static 
	{
		System.out.println("This is static block");
	}
}
class test2 extends test
{
	void FirstName(String fName)
	{
		System.out.println("First Name:"+fName);
	}
}
public class Question_03 {

	public static void main(String[] args) {
		test t=new test2();
        t.FirstName("Shree");
	}

}
