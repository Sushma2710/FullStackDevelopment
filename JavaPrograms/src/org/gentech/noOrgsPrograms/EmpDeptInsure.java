package org.gentech.noOrgsPrograms;

class Employee
{
    String FirstName;
    int Age;
    
    Employee()
    {
    	FirstName="Santosh";
    	Age=83;
      System.out.println("firstName:"+FirstName);
      System.out.println("Age:"+Age);
      System.out.println("+++++++++++");
    }
}

class Department
{
	String DepartmentName;
	String DepartmentID;
	Department()
	{
		DepartmentName="cBlock";
		 DepartmentID="A10bs";
		 System.out.println("DepartmentName:"+DepartmentName);
		 System.out.println(" DepartmentID:"+ DepartmentID);
		  System.out.println("+++++++++++++");
		}
}

class Insurence
{
	String InsurenceId;
	String Name;
	Insurence()
	{
		InsurenceId="45AY";
		 Name="varun";
		 System.out.println("InsurenceId:"+InsurenceId);
		 System.out.println( "Name:"+ Name);
	}
	
}
public class EmpDeptInsure {

	public static void main(String[] args) 
	{
		Employee em=new Employee();
		Department de=new Department();
		Insurence ie=new Insurence();
		

	}

}
