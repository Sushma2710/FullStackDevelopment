package com.gentech.methods;
class countNumber
{
	void Divisible()
	{
		int count = 0;
		for(int i=50;i<150;i++)
		{
			if(i%6==0)
			{
			count=count+i;
		    }
	    }
	System.out.println("Count of number:"+count);
    }
}
public class MainDemo2 {

	public static void main(String[] args) {
		countNumber c=new countNumber();
		c. Divisible();

	}

}
