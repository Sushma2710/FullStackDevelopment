package com.gentech.test4;

class Transposemetrix
{
	void methodTrans()
	{
		int a[][]= {{4,5,8},{8,6,7},{3,1,5}};
		int n=a.length;
		int r[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				r[i][j] = a[j][i];	
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();

		}
	}
}
public class Question_04 {

	public static void main(String[] args) {
		Transposemetrix o=new Transposemetrix();
		o.methodTrans();

	}

}
