package com.gentech.strings;

class Employee
{
	String firstName;
	String jobName;
	Employee(String firstName,String jobName)
	{
		this.firstName=firstName;
		this.jobName=jobName;
	}
	public String toString()
	{
		return "firstNmae:="+firstName+ "jobName:=" +jobName;
	}
	
}
public class StringDemo {

	public static void main(String[] args) {
		Employee e=new Employee("Shree","Dev");
		System.out.println(e);

	}

}
