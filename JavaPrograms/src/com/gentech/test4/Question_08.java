package com.gentech.test4;
class InstanceBlockAndMEthod
{
	{
		System.out.println("This is Instance Block");
	}
	
		void ArrayName(String name) 
		{
			System.out.println("Enter arryName:"+name);
			
		}
	
}
public class Question_08 {

	public static void main(String[] args) {
		InstanceBlockAndMEthod o=new InstanceBlockAndMEthod();
		o.ArrayName("One dimentional Array");
	}

}
