package Arrays;

import java.util.Scanner;

public class middlenor {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Array Elements");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[arr.length/2]);
	}

}
