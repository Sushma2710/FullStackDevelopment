package com.gentech.test2java_1_8_24;

class Name
{
	static String Lname(String name)
	{
		return name;
	}
}
public class static_02 {

	public static void main(String[] args) {
		Name n=new Name();
	    String res=n.Lname("HpLaptop");
	    System.out.println(res);
	    String r=n.Lname("Dell");
	    System.out.println(r);
		//Name.Lname("HpLaptop");
		//System.out.println(Name.Lname("HPlaptop"));

	}

}
