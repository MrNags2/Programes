package Practice;

public class Sample23 {
	String[] arr=null;
	public Sample23(int TotalSeats )
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
	public class Tickets
	{
	public void main(String[] args) {
		Sample23 s1=new Sample23(50);
		s1.BookTickets(10, "Nagraj");
		s1.BookTickets(12, "Akku");
		s1.BookTickets(30, "Vinay");
		s1.BookTickets(5, "Shankar");
		s1.BookTickets(1, "Prashanth");
		
	}
	}

}
