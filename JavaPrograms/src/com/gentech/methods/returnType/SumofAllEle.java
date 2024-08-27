package com.gentech.methods.returnType;

class sumOfElement
{
	int[] SumElement(int a[])
	{
		int sum=0;
		//int num=10;
		int s[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			s[i]=sum;
		}
		return s;
	}
}

public class SumofAllEle {

	public static void main(String[] args)
	{
		sumOfElement f = new  sumOfElement();
		int a[] = {10,20,30,40};
		int s[] = f.SumElement(a);
		System.out.println("Sum of elements are:");
		for(int i : s)
		{
			System.out.print(i+ " ");
		}
		
	}

}
