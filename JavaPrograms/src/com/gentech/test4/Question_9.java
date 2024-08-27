package com.gentech.test4;

class InStaticStaticBlock
{
	{
		System.out.println("This is Instance bloak");
	}
	
	static void StaicMethod()
	{
		int age=76;
		String name="Dhaya";
		System.out.println("Enter the Name:"+name);
		System.out.println("Age is:"+age);
	}
	static
	{
		StaicMethod();
	}
	
}
public class Question_9 {

	public static void main(String[] args) {
		InStaticStaticBlock o=new InStaticStaticBlock();

	}

}
