package Javaclass;

public class staticc {
	static int a=10;
	void disp()
	{
		int b=10;
		int c=20;
		int res=b+c;
		System.out.println(res);
	}
public static void main(String[] args) {
	System.out.println(staticc.a);
	new staticc().disp();
}
}
