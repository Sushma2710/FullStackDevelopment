package com.gentech.methods.returnType;

class Seven
{
	int[] TableSeven(int num)
	{
		int table[]=new int[10];
		for(int i=1;i<10;i++)
		{
			table[i]= num * (i+1);
		}
		return table;
	}
}
public class Return7thTable {

	public static void main(String[] args) {
		Seven c = new Seven();
		int[] result =c.TableSeven(7);
		for(int i=0;i<=result.length;i++)
		{
			System.out.println("7 * " +(i+1)+ "=" +result[i]);
		}
	
	}

}
