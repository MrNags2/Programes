package Nags;
import java.util.Scanner;

public class Perfectno {
	public static void main(String[] args)
	{
		Scanner SC=new Scanner(System.in);
		int num=SC.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			if(sum==num)
			{
				System.out.println("perfect nubwer");
			}
				else
				
					System.out.println("its not a perfect number");
				}
			}
		}
	
