package Tests;

import java.io.*;
import java.util.*;

public class DevideNumbersEvenly {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int N = Integer.parseInt(read.readLine());

			Sol ob = new Sol();

			// System.out.println(ob.evenlyDivides(N));
			// System.out.println(ob.reverse(N));
			// System.out.println(ob.checkPalindrome(N));
			// System.out.println(ob.armstrongNum(N));
			// System.out.println(ob.sumOfDivisors(N));
			System.out.println(ob.checkPrime(N));

			// int a = Integer.parseInt(read.readLine());
			// int b = Integer.parseInt(read.readLine());
			// int ans[] = ob.lcmAndGcd(a, b);
			// System.out.println(ans[0] + " " + ans[1]);

			int a = Integer.parseInt(read.readLine());
			int b = Integer.parseInt(read.readLine());
			int ans[] = ob.getGCDLCM(a, b);
			System.out.println(ans[0] + " " + ans[1]);

			System.out.println("~");
		}
	}
}

class Sol {

	public int[] getGCDLCM(int a, int b) {
		int gcd = 0;
		int lcm = b;
		for (int i = Math.min(a, b); i >= 1; i--) { // Check divisors up to √n
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}

		return new int[] { gcd, lcm };

	}

	public String checkPrime(int n) {
		if (n <= 1) {
			return "Not prime"; // 1 and numbers <= 0 are not prime
		}
		for (int i = 2; i * i <= n; i++) { // Check divisors up to √n
			if (n % i == 0) {
				return "Not prime";
			}
		}
		return "Prime";

	}

	public static int sumOfDivisors(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum = sum + j;

				}
			}
			// or
			// sum = sum + j * (n /i);

		}
		return sum;
	}

	static int evenlyDivides(int n) {
		int countdigits = 0;
		int originalN = n;
		while (n > 0) {
			int lastDigit = n % 10;
			n /= 10;

			if (originalN % lastDigit == 0) {
				countdigits++;
			}

		}
		return countdigits;

	}

	static int reverse(int n) {

		int reverseNum = 0;
		int isNegative = n < 0 ? -1 : 1;
		n = Math.abs(n);

		while (n > 0) {

			int digit = n % 10;
			int maxIntegerValue = (Integer.MAX_VALUE - digit) / 10;

			if (reverseNum > maxIntegerValue) {
				return 0;
			}
			reverseNum = reverseNum * 10 + digit;
			n /= 10;

		}
		return reverseNum * isNegative; //

	}

	static boolean checkPalindrome(int n) {
		if (n < 0) {
			return false;
		}

		int reverseNum = 0;

		int original = n;

		while (n > 0) {

			int digit = n % 10;
			reverseNum = reverseNum * 10 + digit;
			n /= 10;

		}

		return original == reverseNum;

	}

	public int[] lcmAndGcd(int a, int b) {

		int gcd = findGCD(a, b);
		int lcm = (a / gcd) * b;

		return new int[] { gcd, lcm };
	}

	public int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}

	static String armstrongNum(int n) {
		if (n <= 0) {
			return "Enter valid number";
		}

		int sumOfCubes = 0;

		int original = n;

		while (n > 0) {

			int digit = n % 10;
			sumOfCubes = sumOfCubes + (digit * digit * digit);
			n /= 10;

		}

		if (original == sumOfCubes) {
			return "Armstrong";
		} else {
			return "Not armstrong";
		}

	}

}
