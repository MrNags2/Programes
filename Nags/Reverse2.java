package Nags;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=Sc.nextInt();
		int copy=num;
		int rev=0;
		while(num!=0)
		{
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println(rev);
	} 
	

}
