package com.gentech.opps_test_13_8_24;
class Method1
{
	Method1(String FirstName)
	{
	System.out.println("FirstName" +FirstName);
    }
	Method1(int age)
	{
	System.out.println("Age" +age);
    }
}	
public class Question_10 {

	public static void main(String[] args) {
		Method1 m=new Method1("Shree");
		Method1 c=new Method1(20);
	}

}
