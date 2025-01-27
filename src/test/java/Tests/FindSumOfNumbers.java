package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	public static void miniMaxSum(List<Integer> arr) {
	    long totalSum = 0;
	    int min = Integer.MAX_VALUE; // Smallest number in the array
	    int max = Integer.MIN_VALUE; // Largest number in the array

	    for (int number : arr) {
	        totalSum += number;

	       
	        if (number < min) min = number;
	        if (number > max) max = number;
	    }

	    long minSum = totalSum - max;
	    long maxSum = totalSum - min;

	    System.out.println(minSum + " " + maxSum);
	}


}

public class FindSumOfNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		Result.miniMaxSum(arr);

		bufferedReader.close();
	}
}
