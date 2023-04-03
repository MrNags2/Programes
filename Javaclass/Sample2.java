package Javaclass;

import javax.annotation.processing.SupportedSourceVersion;

public class Sample2 {
public static void main(String[] args) {
	System.out.println("******MAIN STARTS***");
	int[] arr={10,20,30};
try{
		System.out.println(arr[8]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("cought......");
}
	System.out.println("*****MAIN ENDS****");
}
}
