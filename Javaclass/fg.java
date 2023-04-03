package Javaclass;

public class fg {
public static void main(String[] args) {
	String str="#J##A##V#A";
	String str1="";
	String str2="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='#')
		{
		
		str1=str1+str.charAt(i);
	}
	else
	{
		str2=str2+str.charAt(i);
	}
}
	System.out.println(str1+str2);
}
}
