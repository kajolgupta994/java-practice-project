package Tests;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class FrequencyCount {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // Number of test cases
		for (int g = 0; g < t; g++) {
			String[] str = (br.readLine()).trim().split(" "); // Reading input as a string array
			int arr[] = new int[str.length]; // Creating integer array from the input
			for (int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}

			// Getting the result from the Solution class
			List<Integer> result = new FrequencyCheck().frequencyCount(arr);

			// Printing the result in the required format
			if (result.isEmpty()) {
				System.out.println("[]");
			} else {
				for (int i = 0; i < result.size(); i++) {
					if (i != 0)
						System.out.print(" ");
					System.out.print(result.get(i));
				}
				System.out.println();
			}
		}
	}
}

//} Driver Code Ends

class FrequencyCheck {
	// Function to count the frequency of all elements from 1 to N in the array.
	public List<Integer> frequencyCount(int[] arr) {
		List<Integer> counts = new ArrayList<>();
		int n = arr.length;
		int[] freq = new int[n];
		for (int i = 0; i < n; i++) {

			if (arr[i] >= 1 && arr[i] <= n) {
				int arrElement = arr[i] - 1;
				freq[arrElement]++;
			}
		}
		for (int count : freq) {
			counts.add(count);
		}

		return counts;

	}
}
