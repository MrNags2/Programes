package Arrays;

import java.util.Scanner;

public class Factoria{
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the array elements");
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		int fact=1;
		{
			for (int j=1;j<=arr[i];j++)
			{
				fact=fact*j;
			}
			System.out.println(fact);
		}
	}
}
}
