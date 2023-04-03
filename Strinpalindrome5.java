import java.util.Scanner;

public class Strinpalindrome5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		String copy=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		System.out.println("its a palindrome");
		else
			System.out.println("its not a palindrome");
	}

}
