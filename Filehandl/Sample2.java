package Filehandl;

import java.io.File;
import java.io.IOException;
public class Sample2 {
public static void main(String[] args) {
	File f1=new File("D:\\File Handling12");
	try {
		if(f1.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file is notn created");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
