package com.gentech.File;
import java.io.File;
import java.io.IOException;
public class FileOperationDemo {

	public static void main(String[] args) {
				createFile();
		//		renameFile();
		//		deleteFile();
		fileCollection();

	}

	private static void createFile()
	{
		try
		{
			File f1=new File("D:\\Demo\\FirstFile.txt");
			File f2=new File("D:\\Demo\\SecondFile.txt");
			File f3=new File("D:\\Demo\\ThirdFile.txt");
			boolean v1 = f1.createNewFile();
			boolean v2 = f2.createNewFile();
			boolean v3 = f3.createNewFile();
			System.out.println("has file created?:" +v1);
			System.out.println("has second file created?:" +v2);
			System.out.println("has third file created?:" +v3);

		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	private static void renameFile()
	{
		File f1=new File("D:\\Demo\\FirstFile.txt");
		File f2=new File("D:\\Demo\\SecondFile.txt");
		boolean v1=f1.renameTo(f2);
		System.out.println(v1);
	}
	private static void deleteFile()
	{
		File f2=new File("D:\\Demo\\SecondFile.txt");
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
