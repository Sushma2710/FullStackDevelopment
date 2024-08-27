package com.gentech.opps_test_13_8_24;
interface university1
{
	abstract void Universityname(String uname);
}
interface Department1 extends university1
{
	abstract void Departmentname(String dname);
}
class college1 implements Department1
{
	@Override
	public void Universityname(String uname) {

		System.out.println("name of university:" +uname);
	}
	@Override
	public void Departmentname(String dname) {
		System.out.println("name od department:" +dname);

	}
	void collegeName(String cname)
	{
		System.out.println("name of college:" +cname);
	}
}
public class Question_06 {

	public static void main(String[] args) {
		college1 c=new college1();
		c.Universityname("VTU");
		c.Departmentname("Tech");
		c.collegeName("sjbit");

	}

}
