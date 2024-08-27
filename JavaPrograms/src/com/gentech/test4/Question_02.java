package com.gentech.test4;
class InstanceMethod
{
	{
		System.out.println("First instance Method");
	}
	{
		System.out.println("Second instance Method");
	}
}
class TestConstruct extends InstanceMethod
{
	TestConstruct()
	{
		System.out.println("This is constructor Method");
	}
}
public class Question_02 {

	public static void main(String[] args) {
		TestConstruct t=new TestConstruct();

	}

}
