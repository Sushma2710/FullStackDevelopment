package com.gentech.opps_test_13_8_24;

interface university
{
	abstract void Universityname(String uname);
}
interface Department
{
	abstract void Departmentname(String dname);
}
abstract class Branch
{
	abstract void BranchName(String bname);
}
class college extends Branch implements university,Department
{
	public void Universityname(String uname)
	{
		System.out.println("name of university:" +uname);
	}
	public void Departmentname(String dname)
	{
		System.out.println("name od department:" +dname);
	}
	void BranchName(String bname)
	{
		System.out.println("name of branch:"+bname);
	}
	 void collegeName(String cname)
	 {
		 System.out.println("name of college:" +cname);
	 }
}
public class Question_02 {

	public static void main(String[] args) {
		college c=new college();
        c.Universityname("vtu");
        c.Departmentname("cse");
        c.BranchName("cs");
        c.collegeName("Sjbit");
	}

}
