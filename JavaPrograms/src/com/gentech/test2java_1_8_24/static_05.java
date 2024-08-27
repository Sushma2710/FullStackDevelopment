package com.gentech.test2java_1_8_24;
class voting
{
	static boolean Eligible(int age)
	{
		if(age>18)
		{
			return true;
		}
		else
		{
		 return false;
		}
	}
}
public class static_05 {

	public static void main(String[] args) {
		voting v=new voting();
		boolean re=v.Eligible(45);
		System.out.println(re);
		
		

	}

}
