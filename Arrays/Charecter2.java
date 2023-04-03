package Arrays;


public class Charecter2 {
	String[] arr=null;
	public Charecter2(int TotalSeats )
	{
		arr=new String [TotalSeats ];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=" ";
		}
		
	}
	public void BookTickets(int Seatno, String PersonName)
	{
		if(arr[Seatno]==" ")
		{
			arr[Seatno]=PersonName;
			System.out.println("In The Seat Number"+Seatno+"Booked by"+PersonName);
		}
		else
		{
			System.out.println("Sorry The Current Seat is Already Booked");
		}
	}
	static class Tickets
	{
	public  static void main(String[] args) {
		Charecter2 s1=new 	Charecter2(50);
		s1.BookTickets(10, "Nagraj");
		s1.BookTickets(12, "Akku");
		s1.BookTickets(30, "Vinay");
		s1.BookTickets(5, "Shankar");
		s1.BookTickets(1, "Prashanth");
		
	}
	}

}



