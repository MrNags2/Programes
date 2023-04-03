package Nags;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number.....");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.println("its a prime number...");
		else
			System.out.println("its not a prime number....");
		
	}
	

}
