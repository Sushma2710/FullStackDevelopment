package com.gentech.test2java_1_8_24;
class OneDarr
{
	int[] oneD(int a[])
	{
		int r[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			r[i]=a[i];
		}
		return r;
	}
}
public class Question_08 {

	public static void main(String[] args) {
		OneDarr o = new OneDarr();
		int a[]= {5,6,5,7,6};
		int[] result=o.oneD(a);
		for(int kk:result)
		{
		System.out.println(kk);
		}
		

	}

}
