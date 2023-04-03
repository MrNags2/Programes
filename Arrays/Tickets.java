package Arrays;

import java.util.Scanner;

public class Tickets {
	String[] arr=null;
	public Tickets(int TotalSeats )
	{
		arr=new String [TotalSeats ];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=" ";
		}
		
	}
	public void BookTickets(int Seatno, String PersonName)
	{
		try{
		if(arr[Seatno]==" ")
		{
			arr[Seatno]=PersonName;
			System.out.println("The Seat Number"+" "+Seatno+" "+"Booked by"+" "+PersonName);
		}
		else
		{
			System.out.println("Sorry The Current Seat is Already Booked");
		}
		}
		catch(Exception e)
		{
			System.out.println("Invalid Seat Number");
		}
	}
	static class Tickets2
	{
	public  static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Seat Number");
	     int Seatno=sc.nextInt();
	     System.out.println("Please Enter the Name");
	String PersonName=sc.next();
		Tickets s1=new 	Tickets(50);
		s1.BookTickets(Seatno, PersonName);
	
		
		
	}
	}

}



