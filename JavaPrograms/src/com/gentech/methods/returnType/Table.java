package com.gentech.methods.returnType;
class TableNumber
{
	String[] numTable(int num)
	{
		String r[]=new String[11];
	    int k=0;
		for(int i=1;i<=10;i++)
		{
            String str=  num+ "*" +i+ "=" +(num*i);
            r[k]=str;
            k=k+1;
		}
		return r;
	}
}
	public class Table {

		public static void main(String[] args) {
			TableNumber t= new TableNumber();
			String res[]=t.numTable(7);
			for(String s:res)
			{
			System.out.println(s);
			}
		}

	}
