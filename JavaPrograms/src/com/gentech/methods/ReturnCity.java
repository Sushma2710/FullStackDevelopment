package com.gentech.methods;
class OddNumber
{
	void Number()
    {
         int flag=0;
	     for(int i=0;i<10;i++)
	    {
		    if(i%2==0)
		    {
			flag=flag+1;
			
		    }
		
		if(flag==0)
		{
			System.out.println(i);
		}
    }
  }
}
public class ReturnCity 
{
    public static void main(String[] args)
	   {
		 OddNumber c = new  OddNumber();
		 c.Number();
	   }

}


