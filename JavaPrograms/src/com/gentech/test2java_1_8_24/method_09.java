package com.gentech.test2java_1_8_24;

class oddNumber
{
	int factorial(int num)
	{
		int fact=1;
		for(int i=2;i<10;i++)
		{
		 fact=fact*fact;
		}
		return fact;
	}
	
}
public class method_09 {

	public static void main(String[] args) {
		oddNumber o= new oddNumber();
		int res=o.factorial(9);
        System.out.println(res);
	}

}
