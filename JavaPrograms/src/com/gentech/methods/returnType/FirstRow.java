package com.gentech.methods.returnType;
class ReturnFirstRow
{
	int[]  matrixRow(int a[][])
	{
		int res[] = new int[a[0].length];
		for(int i=0;i<a[0].length;i++)
		{
			res[i]=a[0][i];
			
		}
		return res;
	}
}
public class FirstRow {

	public static void main(String[] args) {
		ReturnFirstRow r = new ReturnFirstRow();
		int a[][]= {{2,5,6},{5,8,9}};
		int[] result=r.matrixRow(a);
		for(int i:result)
		{
			System.out.print(i + " ");
		}
		
		

	}

}
