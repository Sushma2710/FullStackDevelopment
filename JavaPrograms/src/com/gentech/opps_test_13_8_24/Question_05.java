package com.gentech.opps_test_13_8_24;
class outer
{
	String FirstName;
	inner  i=new inner ();
	outer(String fname)
	{
		System.out.println("firstname:"+fname);
	}
	class inner
	{
		void test (String lname)
		{
			System.out.println("Last name:"+lname);
		}

		public void execute(String string) {
				
		}
	}
	
}
public class Question_05 {

	public static void main(String[] args) {
		outer o=new outer("Shree");
        o.i.test("Dhaya");
	}

}
