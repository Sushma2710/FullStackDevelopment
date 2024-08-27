package com.gentech.test4;
class InAndStaMethod
{
	{
		System.out.println("This is Instance Block");
	}
	static
	{
		System.out.println("This is a static block");
	}
}

class ConMethod extends InAndStaMethod
{
	ConMethod(int number)
	{
		System.out.println("Enter a number:"+number);
	}
}
public class Question_07 {

	public static void main(String[] args) {
		ConMethod o=new ConMethod(5);

	}

}
