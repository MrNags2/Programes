package Nags;

public class Onlydigits3 {
	public static void main(String[] args)
	{
		int num=876365;
		while(num!=0)
		{
			int d=num%10;
			System.out.println(d);
			num=num/10;
		}
	}

}
