package com.gentech.polymorphism;

abstract class File
{
	abstract void FileType();
}
class Document extends File
{
	void FileType()
	{
		System.out.println("The Document File");
	}
}
class word extends File
{
	void FileType()
	{
		System.out.println("The word File");
	}
}

class Pdf extends File
{
	void FileType()
	{
		System.out.println("The pdf File");
	}
}


public class polymorphism_04 {

	public static void main(String[] args) {
		File varities=null;
		
		Document d=new Document();
		word w=new word();
		Pdf p=new Pdf();
		
		varities=d;
		varities.FileType();
		
		varities=w;
		varities.FileType();
		
		varities=p;
		varities.FileType();
		
	}

}
