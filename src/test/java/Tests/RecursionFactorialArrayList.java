package Tests;

import java.io.*;
import java.util.*;

public class RecursionFactorialArrayList {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long N = sc.nextLong();

			ArrayList<Long> ans = ArrayListFactorial.factorialNumbers(N);
			for (long num : ans) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}

class ArrayListFactorial {
	static ArrayList<Long> factorialNumbers(long n) {
		ArrayList<Long> result = new ArrayList<Long>();
		calculateFactorials(1, 1L, n, result);
		return result;
	}

	static void calculateFactorials(long current, long factorial, long limit, ArrayList<Long> result) {
		if (factorial > limit) {
			return;
		}
		result.add(factorial);
		calculateFactorials(current + 1, factorial * (current + 1), limit, result);

	}

}
