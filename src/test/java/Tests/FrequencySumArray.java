package Tests;

import java.util.Arrays;

public class FrequencySumArray {
	public static int maxFrequency(int[] nums, int k) {
		// Sort the array to use the sliding window technique
		Arrays.sort(nums);

		int maxFrequency = 0;
		int left = 0;
		long total = 0; // Keeps track of the total increments needed

		// Sliding window
		for (int right = 0; right < nums.length; right++) {
			// Add the current number to total
			total += nums[right];

			// Check if the current window is valid
			while ((long) nums[right] * (right - left + 1) > total + k) {
				// If not valid, shrink the window from the left
				total -= nums[left];
				left++;
			}

			// Update the maximum frequency
			maxFrequency = Math.max(maxFrequency, right - left + 1);
		}

		return maxFrequency;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4 };
		int k = 5;
		int frequency = maxFrequency(arr, k);
		System.out.println("Frequency of elements: " + frequency);

	}

}
