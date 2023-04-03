package Nags;

public class Onlydigits4 {
	public static void main(String[] args)
	{
		int num=453466345;
		while(num!=0)
		{
			int d=num%10;
			System.out.println(d);
			num=num/10;
		}
	}

}
