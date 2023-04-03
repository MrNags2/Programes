
public class oddfactors {
	public static void main(String[] args) {
		int num=12;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
			}
		}
	}

}
