package com.gentech.constructor;

class Samsung
{
	Samsung(String ProductName,String memory)
	{
		System.out.println(" Samsung Product:" +ProductName);
		System.out.println("memory:"+memory);
    }	

   Samsung(String quality,int amount)
   {
	   System.out.println("Quality of product:"+quality);
	   System.out.println("Amout of product:"+amount);
   }
   Samsung(int ram,int camera)
   {
	   System.out.println("Ram of storage:"+ram);
	   System.out.println("camera pixel:" +camera);
   }
   }
public class SoftwareProduct {

	public static void main(String[] args) {
		Samsung s1=new Samsung("galaxy m11","fourty");
		Samsung s2=new Samsung("good",10000);
		Samsung s3=new Samsung(32,5);
		
	}

}
