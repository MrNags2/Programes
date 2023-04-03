import java.util.Scanner;

public class power {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the base");
	int base=sc.nextInt();
	Scanner ns=new Scanner(System.in);
	System.out.println("Enter the exponent");
	int exp=ns.nextInt();
	int prod=1;
	while(exp!=0)
	{
		prod=prod*base;
		exp--;
	}
	System.out.println(prod);
	{
		
	}
}
}
