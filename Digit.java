import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while(num!=0)
		{
		int d=num%10;
		System.out.println(d);
		num=num/10;
		}
	}

}
