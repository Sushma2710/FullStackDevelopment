package com.gentech.test4;
class Multiplemethods
{
	Multiplemethods()
	{
		
	}
	{
		System.out.println("This is Instance Block");
	}
	static void Test4(String name,int age)
	{
		System.out.println("Enter the name:" +name);
		System.out.println("Enter the age:"+age);
	}
}
public class Question_10 {

	public static void main(String[] args) {
		Multiplemethods o=new Multiplemethods();
        o.Test4("Shree", 19);
	}

}
