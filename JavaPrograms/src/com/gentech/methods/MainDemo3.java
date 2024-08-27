package com.gentech.methods;

class OneDArray
{
	void ArrString(String s[])
	
	{
	
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
public class MainDemo3 
{
    public static void main(String[] args)
    {
    	String s[]= {"navi","naga","ragu","pavi"};
    	OneDArray o=new OneDArray();
    	o.ArrString(s);
    	
    	
	}

}
