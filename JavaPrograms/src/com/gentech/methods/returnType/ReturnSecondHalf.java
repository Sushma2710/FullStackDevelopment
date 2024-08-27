package com.gentech.methods.returnType;

class Secondhalf
{
	// Check the logic
	
	short[] PrintHalfEle(short a[])
	{
		int half = a.length/2;
		short s[]=new short[a.length];
		for(int i=half;i<a.length;i++)
		{
		    s[i]=a[i];
		}
		return s;
	}
}
public class ReturnSecondHalf {

	public static void main(String[] args) {
		Secondhalf f= new Secondhalf();
		short a[]= {100,200,300,400};
		short s[] = f.PrintHalfEle(a);
		System.out.println("The second half of elements are");
		for(int j:s)
		{
			System.out.println(j+ " ");
		}
	

	}

}
