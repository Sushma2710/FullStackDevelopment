package com.gentech.test2java_1_8_24;
abstract class test1
{
	abstract void Campus(String college,String branch);
	abstract void Department(String DName );
	static void Library()
	{
		System.err.println("this is Abstract class");
	}
}
class test2 extends test1
{
	void Campus(String college,String branch)
	{ 
		
		System.out.println("college:"+college+ "branch:"+branch);;
	}
	void Department(String DName )
	{
		System.out.println(DName);
	}
	static void Sports(String SportDirector)
	{
		System.out.println(SportDirector);
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		test2 o=new test2();
        o.Library();
        o.Campus("SJBIT", "CSE");
        o.Department("Computer");
        o.Sports("BooksOfMine");
        test2.Sports("Badmitton");
        test1.Library();
	}

}
