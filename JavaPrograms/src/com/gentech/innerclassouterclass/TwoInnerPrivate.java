package com.gentech.innerclassouterclass;

class TwoOuterPrivate
{
	String firstName;
	Firstinner f=new Firstinner();
	secondinner s=new secondinner();
	void showAge()
	{
		int age=34;
		System.out.println("Age of man is:" +age);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Firstinner getF() {
		return f;
	}
	public void setF(Firstinner f) {
		this.f = f;
	}
	public secondinner getS() {
		return s;
	}
	public void setS(secondinner s) {
		this.s = s;
	}
	private class Firstinner
	{
		int age;
		void showFN()
		{
			firstName="Rama";
			System.out.println("firstName:" +firstName);
		}
	}
	private class secondinner
	{
		int age;
		void showSFN()
		{
			firstName="Raj";
			System.out.println("SecondName:" +firstName);
		}
	}
	void showInnerFN()
	{ 
        f.showFN();
        s.showSFN();
    }
}
public class TwoInnerPrivate {

	public static void main(String[] args) {
		TwoOuterPrivate t = new TwoOuterPrivate();
		t.showAge();
		t.showInnerFN();

	}

}
