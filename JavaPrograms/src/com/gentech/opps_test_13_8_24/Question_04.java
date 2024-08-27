package com.gentech.opps_test_13_8_24;
class callReference
{
	String fname;
	int age;
	callReference(String fname,int age)
	{
		System.out.println(" First Name:" +fname);
		System.out.println("age:"+age);
	}
}
public class Question_04 {

	public static void main(String[] args) {
		callReference o=new callReference("Shree",19);
		
	}

}
