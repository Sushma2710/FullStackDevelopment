package com.gentech.io;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		writeContent();

	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		int n=0;
		try
		{
			fout = new FileOutputStream("D:\\Demo\\Test1.txt",true);

			String str = "There are Mangoes in a Basket";
			str += "mangoes are riped";
			byte b[]=str.getBytes();
			fout.write(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				System.out.println("The file has been closed");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}



