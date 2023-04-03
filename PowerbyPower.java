import java.util.Scanner;

public class PowerbyPower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Elements");
		int arr[]=new int[7];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+i);
		}
	}
	private static int power(int base,int exp)
	{
		int prod=1;
		while(exp!=0)
		{
			prod=prod*base;
		}
		return prod;
	}

}
