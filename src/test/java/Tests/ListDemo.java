package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class RatioOfNumbers {

	public static void plusMinus(List<Integer> arr) {

		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;

		double Elements = arr.size();
		for (int number : arr) {
			if (number > 0) {
				posCount++;

			} else if (number < 0) {
				negCount++;

			} else {
				zeroCount++;

			}

		}

		double ratioPos = posCount / Elements;
		double ratioNeg = negCount / Elements;
		double ratioZero = zeroCount / Elements;

		System.out.println(String.format("%.6f", ratioPos));
		System.out.println(String.format("%.6f", ratioNeg));
		System.out.println(String.format("%.6f", ratioZero));

	}

}

public class ListDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		RatioOfNumbers.plusMinus(arr);

		bufferedReader.close();
	}
}
