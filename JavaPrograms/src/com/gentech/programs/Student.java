package com.gentech.programs;

class Students
{
	String StudentName;
	int Rollno;
}
class Sport
{
	String gender;
	String sportName;
}
class library
{
	String BookName;
	int BookId;
}
class ComputerLab
{
	String StudentName;
	int SystemNo;
}

public class Student {

	public static void main(String[] args) {
		 
		 Students s = new  Students();
		 s.StudentName="Swathi";
		 s.Rollno=6;
		 System.out.println("Name Of Student=" +s.StudentName);
         System.out.println("Student RollNo=" +s.Rollno);	
         
         System.out.println("++++++++++");
           
         Sport sp = new  Sport();
		 sp.gender="female";
		 sp.sportName="Anuradha";
		 System.out.println("Gender Of Student=" +sp.gender);
         System.out.println("Student playing sportname=" +sp.sportName);	
         
         System.out.println("++++++++++");
         
         library l = new library();
		 l.BookName="dsa";
		 l.BookId =24;
		 System.out.println("Book name=" +l.BookName);
         System.out.println("Book Id=" +l.BookId);	
         
         System.out.println("++++++++++");
         
         ComputerLab c = new ComputerLab();
		 c.StudentName="jagan";
		 c. SystemNo=9;
		 System.out.println("StudntName=" +c.StudentName);
         System.out.println("SystemNo=" +c.SystemNo);
         

	}

}
