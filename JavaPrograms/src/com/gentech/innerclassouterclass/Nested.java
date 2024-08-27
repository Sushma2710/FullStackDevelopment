package com.gentech.innerclassouterclass;
class outer
{
	String firstName;
	inner in = new inner();
	void showAge()
	{
		in.age=22;
		System.out.println("Age:"+in.age);
	}
	private class inner
	{
		 int age;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		void showFN()
		{
			firstName="Santosh";
			System.out.println("FirstName:" +firstName);
		}
	}
	void showInnerFN()
	{ 
        in.showFN();
    }
}

public class Nested {

	public static void main(String[] args) {
		   outer o=new outer();
		   o.showAge();
		   o.showInnerFN();
	}
}
