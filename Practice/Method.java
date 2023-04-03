package Practice;

public class Method {
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(int a, double b)
	{
		return a+b;
	}
}
class Main{
	public static void main(String[] args)
	{
		int y=Method.add(10, 20);
		System.out.println(y);
		
	}
}