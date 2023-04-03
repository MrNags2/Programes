package Arrays;

import java.util.Scanner;

public class prime 
{
     public static void main(String[] args) 
       {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the array Elements");
	      int arr[]=new int[5];
	      for(int i=0;i<arr.length;i++)
	        {
		      arr[i]=sc.nextInt();
	        }
	      for(int i=0;i<=arr.length;i++)
	        {
		      boolean flag=true;
		      if(arr[i]>1)
		        {
			      for(int j=2;j<=arr[i]/2;j++)
			        {
				      flag=false;
				       break;
			         }
		         }
     		if(flag)
	    		System.out.println(arr[i]);
	          }
	
       }
}
