import java.util.Scanner;

public class Specificprimeno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int count=0;
		for(int num=2;num<=range; num++)
		{
			boolean flag=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=false;
					 break;
				}
			}
			if(flag)
			{
				count++;
				if(count==10)
				{
					System.out.println(num+"is the"+count+"prime number");
				}
			}
		}
	}
}
		
	


