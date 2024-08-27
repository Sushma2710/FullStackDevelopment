package com.gentech.methods.returnType;

class ComTable
{
	int[] TableFull(int num)
	{
		int table[]=new int[10];
		for(int i=1;i<10;i++)
		{
			table[i]= num * (i+1);
		}
		return table;
	}
}

public class CompleteTable {

	public static void main(String[] args) {
		ComTable c = new ComTable();
		int[] numbers= {1,2,3,4,5,6,7,8,9};
		
		for(int number:numbers)
		{
		  int[] result = c.TableFull(number);
		  System.out.println("multiplication table is" +number+ ":");
		  for(int i=0;i<result.length;i++)
		{
			System.out.println(number+ "*" +(i+1)+ "=" +result[i]);
		}
		  System.out.println();
		}
		
	}

}
