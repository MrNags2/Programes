package Nags;

import java.util.Scanner;

public class Primeno3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		for(int num=2;num<=range;num++)
		{
			boolean flag =true;
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(num+"is a prime number");
			else
				System.out.println(num+"its not a prime number");
		}
		
		
	}

}
