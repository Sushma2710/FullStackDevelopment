package com.gentech.methods;

class CounStr
{
	void stringPrt()
	{
		int count=0;
		
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
			count += 1;
			
			}
		}
		System.out.println(count);
	}
}
public class MainDemo4 {

	public static void main(String[] args) {
		
		CounStr c=new CounStr();
		c.stringPrt();
		
	}

}
