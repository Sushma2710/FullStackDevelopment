package com.gentech.test2java_1_8_24;
class Result
{
	String[] table;
	int sum;
	Result(String[] table,int sum)
	{
		this.table=table;
		this.sum=sum;
	}
}
class Sum
{
	static Result sumresult(int num)
	{
		String arr[]=new String[10];
		int k=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			String str = num+ "*" +i+ "=" +(num*i);
			arr[k]=str;
			k=k+1;
			sum=sum+(num*i);
			}
		return new Result(arr,sum);
	}
}
public class Question_07 {

	public static void main(String[] args) {
		Result s= Sum.sumresult(2);
		for(String kk:s.table)
		{ 
		System.out.println(kk);
		}
		System.out.println("sum:" + s.sum);
		
	}
}


