package com.gentech.methods;

class transpose
{
	void main()
	{
		int x[][]={{2,4,7},{8,4,6},{6,3,9}};
		int n=x.length;
		int y[][]=new int[n][n];
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				y[i][j]=x[j][i];
			}
			System.out.println();
		}
		
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				System.out.print(x[j][i]);
	        }
			System.out.println();
        }
	}
}
public class TransposrMeth {

	public static void main(String[] args) {
		transpose t = new transpose();
		//int x[][]={{2,4,7},{8,4,6},{6,3,9}};
		t.main();
		

	}

}

