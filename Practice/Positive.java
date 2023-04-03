package Practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Positive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the number");
		int num=sc.nextInt();
		if(num<0)
		{
			num=num*-1;
			System.out.println(num);
		}
			else
			{
		System.out.println(num);
			}
		
	}

}
