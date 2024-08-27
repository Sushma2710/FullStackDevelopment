package com.gentech.constructor;
class product
{
	product(String productName)
	{
		System.out.println("productName:"+productName);
	}
	
	product(int payment)
	{
		System.out.println("payment:" +payment);
	}
	product(float varenty)
	{
		System.out.println("varenty:" +varenty);
	}
}

public class Invoice {

	public static void main(String[] args) 
	{
		product pn=new product("wings");
		product pn1=new product("samsung");
		product pn3=new product("wings");
		product p1 = new product(5800);
		product p2 = new product(1500);
		product p3 = new product(9000);
		product p4 = new product(25.5f);
		
	}

}
