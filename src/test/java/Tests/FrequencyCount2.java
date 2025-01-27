package Tests;

import java.util.*;

public class FrequencyCount2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] freq = new int[n + 1];
		for (int i = 0; i < n; i++) {

			freq[arr[i]] += 1;

		}

		int q = sc.nextInt();
		while (q > 0) {
			int number = sc.nextInt();
			if (number >= 1 && number <= n) {
				System.out.println("Frequency of number: " + number + ":" + freq[number]);
			} else {
				System.out.println("Number: " + number + " is out of range");
			}
			q--;
		}
		sc.close();
	}
}

//} Driver Code Ends
