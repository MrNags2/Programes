package Practice;

public class yjutdr {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 18, 16, 14 };
		int res = 1;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i + 1] != 0) {
				res = res * arr[i];
				arr[i + 1]--;
			}
		}
		System.out.println(res);
	}
}
