package patterns;


public class Tread {
	public static void main(String[] args) throws InterruptedException {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n||j==1||j==5)
				{
					
					Thread.sleep(1000);
					
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
