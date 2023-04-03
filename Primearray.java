import java.util.Scanner;

public class Primearray {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the array elements");
		int arr[]=new int[5];
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			int num=arr[j];
		
			for(int z=2;z<num/2;z++)
			{
				if(num%z==0)
				{
					flag=false;
					break;
				}
			}
		

	if(flag)
	{
	System.out.println(arr[j]+"is a prime number");
	}
	else
	{
		System.out.println(arr[j]+"is not a prime number");

}

	}
	}
}
