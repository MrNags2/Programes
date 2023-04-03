package Nags;
import java.util.Scanner;
public class Factor2 {
	public class Factors {
	public static void main(String[] args)
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("enetr the number");
				int num=SC.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
				
		}
		
	}
	}

}
