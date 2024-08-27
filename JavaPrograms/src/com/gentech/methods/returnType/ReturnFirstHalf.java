package com.gentech.methods.returnType;

class firstHalf
{
	int[] Firstnum(int a[])
	{
	   //int half=a.length/2;
	   int[] s= new int[a.length/2];
	   for(int i=0;i<a.length/2;i++)
	{
		  //System.out.println("Second half of the elementsare" +a[i]);  
		  s[i] = a[i];
		 
	  }
		return s;
	}
}

public class ReturnFirstHalf 
{

	public static void main(String[] args) 
	{
		firstHalf f = new firstHalf();
		int a[]= {10,20,30,40,50,60};
		int s[]=f.Firstnum(a);
		System.out.println("first half emements are");
		for(int i:s)
		{
			System.out.print(i+ " ");
		}
		
	}

}
