import java.util.Scanner;

public class Factorsarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array elements");
	int arr[]=new int[5];
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for(int j=0;j<arr.length;j++)
{
	for(int z=1;z<arr[j]/2;z++)
	{
		if(arr[j]%z==0)
		{
			System.out.println(arr[j]);
		}
	}
}
}}
