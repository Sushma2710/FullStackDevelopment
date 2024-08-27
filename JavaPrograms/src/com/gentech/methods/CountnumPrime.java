package com.gentech.methods;

class NumCount
{
	void prime()
	{
		int count=0;
		
	    System.out.println("count of number 5 to 150");
	    
	    for(int i=5;i<=150;i++)	
	    {
	     if(isPrime(i))
		{
			count=count+1;
		}
	   }
	    System.out.println(count);
	}	
	 boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int j=2;j<=Math.sqrt(num);j++)
		{
			if (num % j == 0) 
			return false;
		}
		
		return true;
	}
	}

public class CountnumPrime {

	public static void main(String[] args) {
		NumCount p = new NumCount();
		p.prime();

	}

}
