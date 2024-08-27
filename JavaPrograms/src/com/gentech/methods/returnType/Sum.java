package com.gentech.methods.returnType;

class summation
{
    int sunNum()
    {
    	int x=10;
    	int y=30;
    	int res=x+y;
    	
    	return res;
    }
    
}
public class Sum {

	public static void main(String[] args) {
		summation f= new summation();
		int r=f.sunNum();
		System.out.println(r);
	}

}
