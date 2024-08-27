package com.gentech.File;

import java.io.File;
import java.io.IOException;

public class FileFolderOperation {

	public static void main(String[] args) {
		//	createFolder();
			nestedFolder();
		
		

	}
	
	private static void createFolder()
	{
		
			File f1=new File("D:\\Demo\\FirstFile");
			boolean v1 = f1.mkdir();
			System.out.println("has file created?:" +v1);
		
		
	}
	private static void nestedFolder()
	{
		File f1=new File("D:\\Demo\\Dev1\\Dev2\\Dev3");
		boolean v1=f1.mkdirs();
		System.out.println("has nested file created?" +v1);
	}
	private static void deleteFile()
	{
		File f2=new File("D:\\Demo\\Dev1\\Dev2\\Dev3");
		boolean v = f2.delete();
		System.out.println("has file deleted?:" +v);
	}
	private static void fileCollection()
	{
		File f2=new File("D:\\Demo");
		File f[]=f2.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isFile()==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}
}



