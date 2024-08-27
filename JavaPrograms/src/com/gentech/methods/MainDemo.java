package com.gentech.methods;
class NumBetween
{
    void NumberP()
    {  
        int sum=0;
	    for(int i=0;i<50;i++)
	    {
		    sum=sum+i;
	    }
	    System.out.println(sum);
    }
}
public class MainDemo 
{
    public static void main(String[] args)
    {
		NumBetween p=new NumBetween();
		p.NumberP();
		
	}
}



