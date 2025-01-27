package Tests;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class RecursionFunctionFive {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		while (tc-- > 0) {
			String str[] = br.readLine().split(" ");
			int arr[] = new int[str.length];

			for (int i = 0; i < str.length; i++)
				arr[i] = Integer.parseInt(str[i]);
			S obj = new S();

			obj.reverseArray(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("~");
		}
	}
}
// } Driver Code Ends

class S {
	public void reverseArray(int arr[]) {
		int rev = 0;

		for (int i = arr.length-1; i>=0;  i--) {
			int digit = arr[i] % 10;
			rev = rev * 10 + digit;
			arr[i] = arr[i] / 10;
		}
		
	}
}
