package com.gentech.test2java_1_8_24;

class staticarray
{
	static int[] arrbool(boolean a[])
	{
		int r[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			r[i] = a[i]?0:1;
		}
		return r;
	}
}
public class Question_01 
{

	public static void main(String[] args)
	{
		boolean a[]= {true,false,true,true};
	    int[] result=staticarray.arrbool(a);
	    
	     for(int value:result)
	     {
		System.out.println(value+ "");
	     }
	}

}
