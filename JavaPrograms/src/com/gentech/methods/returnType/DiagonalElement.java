package com.gentech.methods.returnType;

class Diagonal
{
	int[][] Element(int a[][])
	{
		int res[][]=new int[a.length][a[0].length];
		if(a.length==a[0].length)
		{
			for(int i=0;i<a.length;i++)
			{
				res[i][i]=a[i][i];
			}
		}
		return res;
	}
}
public class DiagonalElement {

	public static void main(String[] args) {
		Diagonal d = new Diagonal();
		int a[][]={{10,20,30},{40,50,60},{70,80,90}};
		int[][] result=d.Element(a);
		System.out.println("diagonal elements are:");
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[0].length;j++)
			{
				if(result[i][j] !=0)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
		
		

	}

}
