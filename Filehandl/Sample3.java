package Filehandl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
public static void main(String[] args)  throws IOException{
	File f1=new File("D:\\File Handling.txt");
	FileWriter fw=new FileWriter(f1);
	fw.write("hello");
	fw.write("/n cool");
	fw.write("/n Nagraj");
	System.out.println("Data is written");
	fw.flush();
			
}
}
