package com.gentech.test2java_1_8_24;
class test
{
	  boolean marksvalue(int marks)
	 {
		if(marks >35 && marks<50)
		{
			return true;
		}
		else if(marks >50 && marks<70)
		{
			return true;
		}
		else if(marks >70 && marks<100)
		{
			return true;
		}
		return false;
	}
}
public class methods_06 {

	public static void main(String[] args) {
		test t=new test();
		boolean res=t.marksvalue(76);
		System.out.println(res);

	}

}
