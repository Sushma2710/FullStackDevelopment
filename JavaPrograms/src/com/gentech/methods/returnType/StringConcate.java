package com.gentech.methods.returnType;

class ConCate
{
	String[] Concatenate(String a[])
	{
		String res[] = new String[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			res[i]=a[i]+a[i+1];
		}
		return res;
	}
}
public class StringConcate {

	public static void main(String[] args) {
		 ConCate c=new  ConCate();
		 String a[]= {"anandh","venu"};
		 String result[] = c.Concatenate(a);
		System.out.println("Concatenation of String is" + result);
		 for(String str: result)
		 {
			 System.out.println(str+ " ");
		 }

	}

}
