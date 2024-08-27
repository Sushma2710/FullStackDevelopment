package com.gentech.methods;
class readOneD
{
	void oneDarr(String s[])
	{
		int half=s.length/2;
		for(int i=half;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}

public class OneDstringArray {

	public static void main(String[] args) {
		readOneD r = new readOneD();
		String s[]= {"venu","gopal","janani","bhoomi"};
        r.oneDarr(s);
	}

}
