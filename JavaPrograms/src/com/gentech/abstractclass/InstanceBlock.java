package com.gentech.abstractclass;

abstract class instancemethod
{
	{
		System.out.println("this is instance block");
	}
}
class toInstance extends instancemethod
{
	toInstance()
	{
		System.out.println("sub instance block");
	}
}
public class InstanceBlock {

	public static void main(String[] args) {
		toInstance t = new toInstance();
		
	}

}
