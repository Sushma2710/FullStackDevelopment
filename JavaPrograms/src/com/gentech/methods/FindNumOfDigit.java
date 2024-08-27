package com.gentech.methods;

class digit
{
	void NumofDigit(int num)
	{
		if(num>=0 && num<10)
		{
			System.out.println(num+ "\s single digit");
		}

		else if(num>=10 && num<100)
		{
			System.out.println(num+ "\s double digit");
		}

		else if(num>=100 && num<1000)
		{
			System.out.println(num+ "\s three digit");
		}
		else
		{
			System.out.println(num+ "\s more 3 than  digit");
		}
	}
}
public class FindNumOfDigit {

	public static void main(String[] args) {
		digit d = new digit();
		d.NumofDigit(1);
		d.NumofDigit(15);
		d.NumofDigit(100);
		d.NumofDigit(888888);

	}

}
