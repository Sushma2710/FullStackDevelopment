package com.gentech.constructor;

class report
{
	report(String ppt)	
	{
		System.out.println("ppt document file" +ppt);
	}	
	report(char word)
	{
		System.out.println("word document:"+word);
	}
}

public class ReportGenerator {

	public static void main(String[] args) {
		report r1=new report("arrays.pdf");
		report r2=new report("word.doc");
		report r3=new report('p');
		

	}

}
