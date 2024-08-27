package com.gentech.methods;

class boolen
{
	void main(boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

public class BooleanOneDarr {

	public static void main(String[] args) {
		boolen b = new boolen();
		boolean a[]= {true,false,true,true,true};
		b.main(a);
		

	}

}
