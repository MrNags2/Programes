package Practice;

import java.util.Scanner;

public class Singledidit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x= sc.nextInt();
		if(x>=-9 && x<=9)
		{
			System.out.println("its a single didgt number");
			
		}
			else
				{
				System.out.println("its not single digit");
				}
		
	}

}
