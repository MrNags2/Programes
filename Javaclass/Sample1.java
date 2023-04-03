package Javaclass;

public class Sample1 {
public static void main(String[] args) {
	System.out.println("****MAIN STARTS***");
	try
	{
		int i=1/0;
	}
	catch (ArithmeticException e)
	{
		System.out.println("Handeled....");
	}
	System.out.println("*****MAIN ENDS***");
}
}
