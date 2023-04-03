package Arrays;

import java.util.Arrays;

public class Maxsum {
	public static void main(String[] args) {
		int arr[]={10,34,32,31,56,43};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]+arr[arr.length-2]);
		System.out.println(arr[arr.length-1]-arr[arr.length-2]);
		System.out.println(arr[0]+arr[1]);
		System.out.println(arr[1]-arr[0]);
		
	}

}
