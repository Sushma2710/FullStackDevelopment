package com.gentech.polymorphism;
abstract class Differentsound
{
	abstract void sound();
}
class DogSound extends Differentsound
{
	void sound()
	{
		System.out.println("The sound of Dog:");
	}
}
class CatSound extends Differentsound
{
	void sound()
	{
		System.out.println("The sound of Cat:");
	}
}
class CowSound extends Differentsound
{
	void sound()
	{
		System.out.println("The sound of Cow:");
	}
}
public class polymor_01 {

	public static void main(String[] args) {
		Differentsound animal=null;
		
		DogSound d=new DogSound();
		CatSound c=new CatSound();
		CowSound o=new CowSound();
		
		animal=d;
		animal.sound();
		
		animal=c;
		animal.sound();
		
		animal=o;
		animal.sound();

	}

}
