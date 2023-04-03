package Arrays;

public class Dynamic {
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
		 public class Tickets2
		{
		public void main(String[] args) {
			Tickets s1=new 	Tickets(50);
			s1.BookTickets(10, "Nagraj");
			s1.BookTickets(12, "Akku");
			s1.BookTickets(30, "Vinay");
			s1.BookTickets(5, "Shankar");
			s1.BookTickets(1, "Prashanth");
			s1.BookTickets(12, "Akku");
			s1.BookTickets(53, "kurki");
		}
		}
	}
}
	
