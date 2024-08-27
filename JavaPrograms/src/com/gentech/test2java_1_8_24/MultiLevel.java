package com.gentech.test2java_1_8_24;
class AA
{
	AA()
	{
		System.out.println("This is first constructor");
	}
}
class BB extends AA
{
	BB()
	{
		System.out.println("This is second constructor");
	}
}
class CC extends BB
{
	CC()
	{
		System.out.println("This is Third constructor");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		
		CC o=new CC();
	}

}
