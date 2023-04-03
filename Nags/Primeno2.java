package Nags;


import java.util.Scanner;

public class Primeno2 {
public static void main(String[] args) {
	//Scanner sc=new Scanner (System.in);
	//System.out.println("enter the number");
	//int num1=sc.nextInt();
	for(int num=2;num<=100;num++)
	{
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		System.out.println(num+"its a prime number...");
		else
			System.out.println(num+"its not a prime number....");
		
	}
}
}
