package Nags;

public class Veg1 {
void food()
{
	System.out.println("Food Available");
	System.out.println("Chitranna");
	System.out.println("Curd-Rice");
	System.out.println("White-Rice");
	System.out.println("Rassam");
	System.out.println("Palava");
	System.out.println("veg palav");
}
}
class Nonveg2 
{
	void food()
	{
		
	}
}
class Main
{
public static void main(String[] args)
{
	Veg1 v1=new Veg1();
	Nonveg2 n1=new Nonveg2();
	System.out.println("Pleas Select The option");
	System.out.println("1.Veg");
	System.out.println("2.Nonveg");
}
}


