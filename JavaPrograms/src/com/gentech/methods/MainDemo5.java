package com.gentech.methods;

class concat
{
	void charCon()
	{
		int a[][]= {{'c','y'},{'f','o'}};
		int b[][]= {{'y','r'},{'u','g'}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{   
				System.out.print(a[i][j]);
			}
			
		}
	}
}
public class MainDemo5 {

	public static void main(String[] args) {
		concat o=new concat();
		o.charCon();
		
	}

}
