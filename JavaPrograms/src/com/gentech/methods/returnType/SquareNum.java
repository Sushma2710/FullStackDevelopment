package com.gentech.methods.returnType;

class Square
{
	int Squr()
	{
		int sqr=1;
		for(int i=0;i<=10;i++)
		{
		    sqr=i*i;
			System.out.println(sqr);
		}
		return sqr;
	}
}
public class SquareNum {

	public static void main(String[] args) {
		Square s = new Square();
		 int r = s.Squr();
		 
		     System.out.println("square of number is:" +r);
			
	}
}
