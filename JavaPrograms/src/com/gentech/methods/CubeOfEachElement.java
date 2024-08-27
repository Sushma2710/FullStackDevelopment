package com.gentech.methods;

class cubenum
{
	void cubmain(int a[])
	{ 
		for(int i=0;i<a.length;i++)
		{
			int cube=a[i]*a[i]*a[i];
			System.out.println("cube of number is" +a[i]+ "is" +cube);
		}
	}
}
public class CubeOfEachElement {

	public static void main(String[] args) {
		cubenum c = new cubenum();
		int a[] = {1,5,6,9,7};
		c.cubmain(a);

	}

}
