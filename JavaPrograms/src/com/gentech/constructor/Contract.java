package com.gentech.constructor;

class Reason
{
	Reason(String contractReason)
	{
		System.out.println("reason for contract:" +contractReason);
	}
	Reason(int years)
	{
		System.out.println("years of contract:"+years);
	}
	Reason(long amount)
	{
		System.out.println("Amount to be paid as contract"+amount);
	}
}

public class Contract {

	public static void main(String[] args) {
		Reason r1=new Reason("renting of home");
		Reason r2=new Reason(2);
		Reason r3=new Reason(100000);

	}

}
