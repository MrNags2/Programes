import java.util.Scanner;

public class SumofEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("eneter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			if(d%2==0)
			{
				sum=sum+d;
				System.out.println(sum);
			}
			//System.out.println(sum);
			num=num/10;
			//System.out.println(sum);
		}
		
				
	
}

}
