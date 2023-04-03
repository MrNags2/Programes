package Nags;

public class Onlydigits {
	public static void main(String[] args)
	{
		int num=1425364;
		while(num!=0)
		{
			int d=num%10;
			System.out.println(d);
			num=num/10;
		}
	}

}
