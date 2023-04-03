package Nags;

import java.util.Scanner;

class Veg {
	void food() {
		System.out.println("********Foods Available********");
		System.out.println("1.Chitranna");
		System.out.println("2.Curd-Rice");
		System.out.println("3.White-Rice");
		System.out.println("4.Rassam");
		System.out.println("5.Palava");
		System.out.println("6.veg palav");
	}
}

class Nonveg2 {
	void nonfood() {
		System.out.println("********Foods Available*********");
		System.out.println("1.Mutton Biriyani");
		System.out.println("2.Chicken Biriyani");
		System.out.println("3.Chicken Masala");
		System.out.println("4.Mutton Masala");
		System.out.println("5.Liver Fry");
		System.out.println("6.Kabab");
	}
}

class Main {
	public static void main(String[] args) {
		Veg1 v1 = new Veg1();
		Nonveg2 n1 = new Nonveg2();
		System.out.println("Pleas Select The option");
		System.out.println("1.Veg");
		System.out.println("2.Nonveg");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 1) {
			v1.food();
			System.out.println("***********************");
			System.out.println("Please Select the food");
			int y = sc.nextInt();
			if (y == 1) {
				System.out.println("The Chitranna Price is 50rs");
			}

			if (y == 2) {
				System.out.println("The CurdRice Price is 50rs");
			}
			if(y==3)
			{
				System.out.println("The White-Rice Price is 75rs");
			}
			if(y==4)
			{
				System.out.println("The Rassam  Price is 30rs");
			}
			if(y==5)
			{
				System.out.println("The Palav Price is 100rs");
			}
			if(y==6)
			{
				System.out.println("The VegPalav Price is 110rs");
			}
		}

		if (x == 2) {
			n1.nonfood();
			System.out.println("***********************");
			System.out.println("Please Select the food");
			int z = sc.nextInt();
			if (z == 1) {
				System.out.println("The Mutton Biriyani Price is 120rs");
			}
			if (z == 2) {
				System.out.println("the Chicken Biriyani Price is 200rs");
			}
			if(z==3)
			{
				System.out.println("The Chicken Grevy Price is 150rs");
			}
			if(z==4)
			{
				System.out.println("The Mutton Price is 200rs");
			}
			if(z==5)
			{
				System.out.println("The Liver Fry Price is 175rs");
			}
			if(z==6)
			{
				System.out.println("The Kabab Price is 100rs");
			}
		}
		System.out.println("Please Enter your Name:");
		String s=sc.next();
		System.out.println("Please Enter your Phone no:");
		long r=sc.nextLong();
		System.out.println("Thank you for ordering");
	}
}
