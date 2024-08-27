package com.gentech.test2java_1_8_24;
class area
{
    static double circle(double r)
	{
    	double p=3.14;
    	double res = p*r*r;
    	return res;
    }
}
public class static_03 {

	public static void main(String[] args) {
		area a= new area();
		double result = a.circle(4);
		System.out.println(result);
		
	}

}
