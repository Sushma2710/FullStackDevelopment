package com.gentech.innerclassouterclass;

class outerclass
{
	String firstname;
	inner in = new inner();
	 void showAge()
	 {
		 int age=45;
		 System.out.println("Age is:"+age);
	 }
	 static class inner
	 {
		 int age;
		 void showFN(outerclass outerInstance)
		 {
			 outerInstance.firstname="Anandh";
			 System.out.println("FirstName is:" +outerInstance.firstname);
		 }
		 
	 }
}
public class staticinnerclass {

	public static void main(String[] args) {
		outerclass o=new outerclass();
		o.showAge();
        o.in.showFN(o);
	}

}
