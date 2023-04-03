package Arrays;

import java.util.Scanner;

public class Evenarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the array elements");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				System.out.println(arr[j]);
			}
		}
	
}

}
