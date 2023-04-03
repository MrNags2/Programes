import java.util.Scanner;

public class Factorialofarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the array elements");
		int arr[]=new int[5];
		int fact=1;
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
		 num=arr[j];
		}
			//int num;
			for(int z=1;z<=num;z++)
			{
				fact=fact*z;
			}
			System.out.println(fact);
		}
		}
