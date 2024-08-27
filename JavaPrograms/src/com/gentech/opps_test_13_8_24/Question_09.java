package com.gentech.opps_test_13_8_24;

abstract class Plus
{
	abstract void plusSymbol(int x,int y);
}

class Concatenation extends Plus
{
	void plusSymbol(int str1,int str2) 
	{
	System.out.println("Concatenation:" +(str1+str2));
	}
}
class Addition extends Plus
{
	void plusSymbol(int x,int y) 
	{
		System.out.println("Addition result:" +(x+y));
	}
	
}
public class Question_09 {

	public static void main(String[] args) {
		Plus symbol=null;
		
		Concatenation c=new Concatenation();
		Addition a=new Addition();
		
		symbol=c;
		
    
	}

}
