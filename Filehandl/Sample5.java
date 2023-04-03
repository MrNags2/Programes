package Filehandl;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Sample5 {
public static void main(String[] args) throws IOException {
	File f1=new File("D:\\File Handling.txt");
	FileWriter fw=new FileWriter(f1,true);
	fw.write("hot");
	System.out.println("Data is Written");
	fw.flush();
}
}
