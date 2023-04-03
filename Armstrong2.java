import java.util.Scanner;

public class Armstrong2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		for(int num1=1;num1<=100;num1++)
		{
		while(num1!=0)
		{
			int d= num1%10;w3wd
			sum=sum+power(d, count(copy));
			num1=num1/10;
		}
		//if(copy==sum)
			//System.out.println("Is an Armstrong number");
		//else
			//System.out.println("is not an armstrong number");
	}
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
