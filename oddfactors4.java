import java.util.Scanner;

public class oddfactors4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the number");
		int num=sc.nextInt();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
			}
		}
	}

}
