package Tests;

public class ReverseArrayElement {
	public static int[] revArray(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 6, 7, 1 };
		int[] result = revArray(arr);
		for (int num : result) {
			System.out.print(num + " ");
		}

	}

}
