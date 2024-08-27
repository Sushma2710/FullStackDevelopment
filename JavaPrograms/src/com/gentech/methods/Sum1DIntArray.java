package com.gentech.methods;
class OneDInt
{
	void sumarr(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements is:"+sum);
	}
  
}
public class Sum1DIntArray {

	public static void main(String[] args) {
		OneDInt o = new OneDInt();
		int a[]= {10,20,30,40};
		o.sumarr(a);

	}

}
