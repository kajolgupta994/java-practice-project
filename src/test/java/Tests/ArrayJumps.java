package Tests;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class ArrayJumps {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String line = br.readLine();
			String[] tokens = line.split(" ");

			// Create an ArrayList to store the integers
			ArrayList<Integer> array = new ArrayList<>();

			// Parse the tokens into integers and add to the array
			for (String token : tokens) {
				array.add(Integer.parseInt(token));
			}

			int[] arr = new int[array.size()];
			int idx = 0;
			for (int i : array)
				arr[idx++] = i;

			System.out.println(new So().minJumps(arr));
			// System.out.println("~");
		}
	}
}

//} Driver Code Ends

class So {
	static int minJumps(int[] arr) {
		int n = arr.length;
		if (n <= 1) {
			return 0;
		}
		if (arr[0] == 0) {
			return -1;
		}
		int jumps = 1;
		int farthest = arr[0];
		int current_end = arr[0];
		for (int i = 0; i <= n; i++) {
			farthest = Math.max(farthest, i + arr[i]);

			if (i == current_end) {
				jumps++;
				current_end = farthest;
				if (current_end >= n - 1) {
					return jumps;
				}
			}

			if (farthest == i) {
				return -1;
			}
		}
		return jumps;
	}
}
