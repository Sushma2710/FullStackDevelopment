package com.gentech.Inheritance;

class studentoverload
{
	studentoverload(String sName,int sRoll,int Age)
	{
		System.out.println("Student name:" +sName);
		System.out.println("Student rollno:" +sRoll);
		System.out.println("Student age: " + Age);
	}
	studentoverload(int Age)
	{
		System.out.println("Student age:" +Age);
	}
}
class collegeoverload extends studentoverload
{	
	collegeoverload(String collegeName)
	{
		super("Nayana",56,25);
		System.out.println("collegeName:"+collegeName);	    
	}
}
class branchoverload extends collegeoverload
{
	branchoverload(String branchName)
	{
		super("vidya");
		System.out.println("Branch Name:" +branchName);
		}
}
public class MultipleInheritConstructorOverLoad {
	public static void main(String args[])
	{
		branchoverload b=new branchoverload("CSE");
	}

}
