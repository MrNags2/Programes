package Arrays;
import java.util.Arrays;
public class Charecter1 {
	public static void main(String[] args) {
		int arr[]={9,5,1,3,8};
		char ch[]=new char[arr.length];
        Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			ch[i]=(char)(arr[i]+64);
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(ch[j]);
		}
	}

}
