package com.gentech.methods;
class doubleSum
{
	void sum()
	{
		double x[][]={{2.33,4.99,7.44},{8.11,4.33,6.55},{6.00,3.55,9.1}};
		double sum2=0;
		
		for (int j = 0; j < x[1].length; j++) {
            sum2 += x[1][j];
		}
			System.out.println(sum2);
	 }
 }

public class SumOfSecondrow
{

	public static void main(String[] args)
	{
		doubleSum d = new doubleSum();
		d.sum();
    }
}
