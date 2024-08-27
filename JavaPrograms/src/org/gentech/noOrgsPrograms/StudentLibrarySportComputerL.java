package org.gentech.noOrgsPrograms;

class Students
{
	String StudentName;
	int Rollno;
	Students()
	{
		StudentName="Swathi";
		Rollno=6;
		 System.out.println("Name Of Student=" +StudentName);
        System.out.println("Student RollNo=" +Rollno);	
        
        System.out.println("++++++++++");
	}
}
class Sport
{
	String gender;
	String sportName;
	Sport()
	{
		gender="female";
	    sportName="Anuradha";
		 System.out.println("Gender Of Student=" +gender);
        System.out.println("Student playing sportname=" +sportName);	
        
        System.out.println("++++++++++");
        
	}
}
class library
{
	String BookName;
	int BookId;
	library()
	{
		BookName="dsa";
		BookId =24;
		System.out.println("Book name=" +BookName);
        System.out.println("Book Id=" +BookId);	
        
        System.out.println("++++++++++");
	}
}
class ComputerLab
{
	String StudentName;
	int SystemNo;
	ComputerLab()
	{
		StudentName="jagan";
		SystemNo=9;
		System.out.println("StudntName=" +StudentName);
        System.out.println("SystemNo=" +SystemNo);
	}
}

public class StudentLibrarySportComputerL {

	public static void main(String[] args) {
		 
		 Students s = new  Students();
         Sport sp = new  Sport();
		 library l = new library();
		 ComputerLab c =
				 new ComputerLab();
	}

}

