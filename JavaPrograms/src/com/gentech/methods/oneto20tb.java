package com.gentech.methods;

class table
{
	void oneto20(int num)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(num+ "*" +i+ "=" +(num*i));
		}
	}
}
public class oneto20tb {

	public static void main(String[] args) {
		table t = new table();
		t.oneto20(3);
		t.oneto20(5);

	}

}
