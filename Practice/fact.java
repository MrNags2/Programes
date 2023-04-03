package Practice;

import java.util.Scanner;

public class fact {
static int fact(int no)
{
	if(no==1)
return 1;
	return no*fact(no-1);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rangee");
int range=sc.nextInt();
for(int i=1;i<=range;i++){
		System.out.println(fact(i));
}
}
}
