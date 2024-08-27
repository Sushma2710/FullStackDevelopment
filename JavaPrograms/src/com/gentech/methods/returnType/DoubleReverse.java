package com.gentech.methods.returnType;

class returnDouble
{
	double[] Reverse(double a[])
	{
		double s[]=new double[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			s[i]=a[a.length-1-i];
		}
		return s;
	}
}
public class DoubleReverse {

	public static void main(String[] args) {
		returnDouble r = new returnDouble();
		double a[]= {2.22,3.22,4.22,6.22};
		double s[]= r.Reverse(a);
		System.out.println("reverse of numbers are");
		for(double i : s)
		{
			System.out.println(i+ " ");
		}
	}

}
