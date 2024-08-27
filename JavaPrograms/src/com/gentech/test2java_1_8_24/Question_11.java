package com.gentech.test2java_1_8_24;

class BirdsName
{
	String[] Name(String a[])
	{
		String[] res=new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}
public class Question_11 {

	public static void main(String[] args) {
		BirdsName b=new BirdsName();
		String a[]= {"peacock","paret","pigion"};
		String[] result=b.Name(a);
		for(String kk:result)
		{
			System.out.println(kk);
		}
		

	}

}
