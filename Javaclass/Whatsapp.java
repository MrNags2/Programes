package Javaclass;

public class Whatsapp {
	void send(int a)
	{
		System.out.println("only integer value can be written"+ a);
	}
	void send(String str)
	{
		System.out.println("only string value can be send"+"  "+str);
	}
	void send(String str,int a)
	{
		System.out.println("both string and integer value can be writte"+str+" "+a);
	}
	public static void main(String[] args) {
		Whatsapp w1=new Whatsapp();
		w1.send(10);
		w1.send("hello");
		w1.send("hello",10);
	}

}
