package Nags;

import java.util.Scanner;

public class Armstrong3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int d= num%10;
			sum=sum+power(d, count(copy));
			num=num/10;
		}
		if(copy==sum)
			System.out.println("Is an Armstrong number");
		else
			System.out.println("is not an armstrong number");
	}
	static int count(int copy)
	{
		int count=0;
		while(copy!=0)
		{
			copy=copy/10;
			count++;
		}
		return count;
	}
	static int power(int base, int exp)
	{
		int prod=1;
				while(exp!=0)
				{
					prod = prod*base;
					exp--;
				}
				return prod;
	}


}
