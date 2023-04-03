package Javaclass;
class MarriageException extends Exception
{
	String msg;
	MarriageException(String msg)
	{
		this.msg=msg;
	}
public String getMarriage()
{
	return msg;
}
}
public class Shadidotcom
{			
	static void Submit() throws MarriageException
	{
		int age=15;
		if(age>=21)
		{
			System.out.println("happy life");
		}
		else
		{
			throw new MarriageException("invalid age");
			
		}
	}
	public static void main(String[] args) {
		try{
			Submit();
		}
		catch(MarriageException e)
		{
			System.out.println(e.getMarriage);
		}
	}
		}


