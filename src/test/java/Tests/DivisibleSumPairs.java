package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result4 {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int pairs = 0;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if ((ar.get(i) + ar.get(j)) % k == 0) {
					pairs++;
				}

			}

		}
		return pairs;
	}
}

public class DivisibleSumPairs {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output3.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> ar = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arTemp[i]);
			ar.add(arItem);
		}

		int result = Result4.divisibleSumPairs(n, k, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
