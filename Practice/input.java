package Practice;

public class input {
	public static void main(String[] args) {
		String str="First number is 10 and Secind number is 20";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=0 && str.charAt(i)<+9 && str.charAt(i+1)>+0 && str.charAt(i+1)<=0)
			{
				int a=(int)str.charAt(i);
				int b=(int)str.charAt(i+1);
				int c=a+b;
				System.out.println("hello");
			}
		}
	}
	System.out.println("hello");

}
