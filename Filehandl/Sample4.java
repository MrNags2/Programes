package Filehandl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample4 {
public static void main(String[] args) throws IOException {
	File f1=new File("D:\\File Handling.txt");
			FileReader fr=new FileReader(f1);
char[] arr=new char[(int) f1.length()]	;
fr.read(arr);
String s1=new String(arr);
System.out.println(s1);
}
}
