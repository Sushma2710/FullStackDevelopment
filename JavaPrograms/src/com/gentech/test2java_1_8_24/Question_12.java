package com.gentech.test2java_1_8_24;

class encapsulation
{
	
		private String FirstName;
		private int age;

		public String getFirstName()
		{
			return FirstName;
		}
		public int getage()
		{
			return age;
		}
		public void setFirstName(String name)
		{
			this.FirstName=name;
		}
		public void setage(int Age)
		{
			this.age=Age;
		}
	}

public class Question_12 {

	public static void main(String[] args) {
		encapsulation o=new encapsulation();
		o.setFirstName("Shree");
		o.setage(19);
		
		String name=o.getFirstName();
		System.out.println(name);
		
		int Age=o.getage();
		System.out.println(Age);
		

	}

}
