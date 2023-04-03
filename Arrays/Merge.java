package Arrays;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int arr[]={3,23,67,98,20};
		int brr[]={34,54,48,49,34};
		int res[]=new int[arr.length+brr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[i];
		}
		for(int j=0;j<brr.length;j++)
		{
			res[j+arr.length]=brr[j];
		}
		System.out.println(Arrays.toString(res));

}

}
