package com.gentech.Inheritance;

class student
{
	student(String sName,int sRoll)
	{
		System.out.println("Student name:" +sName);
		System.out.println("Student rollno:" +sRoll);
	}
}
class college extends student
{	
	college(String collegeName)
	{
		super("Nayana",56);
		System.out.println("collegeName:"+collegeName);	    
	}
}
class branch extends college
{
	branch(String branchName)
	{
		super("vidya");
		System.out.println("Branch Name:" +branchName);
		}
}

public class ParaConstructorMultilevel {

	public static void main(String[] args) {
		branch b = new branch("CS");
	}

}
