package com.gentech.methods;

class primenm
{
	void isPrime()
	{
		System.out.println("Prime numbers from 1 to 50 are:");
        for (int i = 2; i <= 50; i++)
        {
             if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
	}
		boolean isPrime(int num)
		{
	        if (num <= 1)
	        {
	        	System.out.println("not prime number");
	        }
	        
	        for (int j = 2; j <= Math.sqrt(num); j++)
	        {
	            if (num % j == 0) 
	            {
	            	System.out.println("not prime number");
	            }
	        }
	        return true;
	    }
}
public class PrimeBetween1to50 {

	public static void main(String[] args) {
		primenm p = new primenm();
		p.isPrime();
	}

}
