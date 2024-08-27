package com.gentech.test2java_1_8_24;
class arearectanglr
{
    static int rect( int l,int b)
	{
    	
    	int res = l*b;
    	return res;
    }
}
public class static_04 {
	public static void main(String[] args) 
	{
		arearectanglr a= new arearectanglr();
	      int result = a.rect(8,9);
	      System.out.println(result);
	}
}
