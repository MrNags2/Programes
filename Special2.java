import java.util.Scanner;

public class Special2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int d1=num%10;
		int d2=num/10;
		int sum=d1+d2+d1*d2;
		if(sum==num)
		System.out.println("Its a special Digit number");
		else
			System.out.println("its not a single digit number");
		}
		
		
	}


