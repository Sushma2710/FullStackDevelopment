package com.gentech.innerclassouterclass;
class Twoouterclass
{
	String firstname;
	firstinner in = new firstinner();
	secondinner inn=new secondinner();
	void showAge()
	{
		int age=55;
		System.out.println("Age is:"+age);
	}
	static class firstinner
	{
		int age;
		void showFN(Twoouterclass outerInstance)
		{
			outerInstance.firstname="Praveen";
			System.out.println("FirstName is:" +outerInstance.firstname);
		}

	}
	static class secondinner
	{
		int age;
		void showFNN(Twoouterclass outerInstance)
		{
			outerInstance.firstname="Gopal";
			System.out.println("FirstName is:" +outerInstance.firstname);
		}

	}
}
public class TwoInnerStatic {

	public static void main(String[] args) {
		Twoouterclass o=new Twoouterclass();
		o.showAge();
		o.in.showFN(o);
		o.inn.showFNN(o);
	}

}
