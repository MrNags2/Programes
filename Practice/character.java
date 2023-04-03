package Practice;

public class character {
public static void main(String[] args) {
	String str="efgh";
	String str1=" ";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		int x=(int)ch;
		char bh=(char)(x+4);
		System.out.println(bh);
	}
	
}
}
