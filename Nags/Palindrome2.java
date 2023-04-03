package Nags;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int num=Sc.nextInt();
		int copy=num;
		int rev=0;
		while(num!=0)
		{
			int d= num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if (rev==copy)
		{
			System.out.println("its a palindrom");
		}else
			{
				System.out.println("its not a palindrome4");
		}
	}
}

