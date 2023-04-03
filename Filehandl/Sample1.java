package Filehandl;

import java.io.File;

public class Sample1 {
public static void main(String[] args) {
	File f1=new File("D:\\File Handling");
	if(f1.mkdirs())
	{
		System.out.println("Folder is created");
	}
	else
	{
		System.out.println("folder is not created");
	}
	if(f1.exists())
	{
		System.out.println("folder exists");
	}
	else
	{
		System.out.println("Folder doesnot exists");
	}
//	if(f1.delete())
//	{
//		System.out.println("Folder is deleted");
//	}
//	else
//	{
//		System.out.println("Folder is not deleted");
//	}
}
}
