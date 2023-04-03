package Practice;

public class NStringco {
	public static void main(String[] args) {
		String str="MASTER";
		String res="";
		for(int i=0;i<str.length();i++)
		{
			char bh=str.charAt(i);
			int x=(int)bh;
			char ch=(char)(x+32);
			res=res+ch;
			//System.out.print(ch);
		}
		System.out.println(res);
		
	}

}
