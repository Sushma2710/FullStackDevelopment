package com.gentech.polymorphism;

abstract class Taste
{
	abstract void TasteOfFood();
}
class southIndia extends Taste
{
	void TasteOfFood()
	{
        System.out.println("chapathi");
        System.out.println("Anna,Sambar");
        System.out.println("Roti");
	}
}
class northIndia extends Taste
{
	void TasteOfFood()
	{
		System.out.println("Sanwitch");
		System.out.println("Mommoes");
		System.out.println("vadaPaw");
	}
}
public class Polymorphism_02 {

	public static void main(String[] args) {
		Taste vareites=null;
		
		southIndia s=new southIndia();
		northIndia n=new northIndia();
		
		vareites=s;
		vareites.TasteOfFood();
		
		
		vareites=n;
		vareites.TasteOfFood();

	}

}
