package com.gentech.polymorphism;

abstract class Language
{
	abstract void DiffLanguage();
}

class cLanguage extends Language
{
	void DiffLanguage()
	{
		System.out.println("The C Language");
	}
}
class JavaLanguage extends Language
{
	void DiffLanguage()
	{
		System.out.println("The JavaLanguage Language");
	}
}
class JavaScriptLanguage extends Language
{
	void DiffLanguage()
	{
		System.out.println("The JavaScriptLanguage Language");
	}
}
public class Polymorphism_03 {

	public static void main(String[] args) {
		Language info=null;
		
		cLanguage c=new cLanguage();
		JavaLanguage j=new JavaLanguage();
		JavaScriptLanguage s=new JavaScriptLanguage();
		
		info=c;
		info.DiffLanguage();
		
		info=j;
		info.DiffLanguage();
		
		info=s;
		info.DiffLanguage();

	}

}
