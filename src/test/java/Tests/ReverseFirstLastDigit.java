package Tests;

import java.util.*;

public class ReverseFirstLastDigit {
	public static int reverseFirstLastDigits(int num) {
		if (num < 10) {
			// If the number is a single digit, return it as is
			return num;
		}
		int lastDigit = num % 10; // Extract the last digit
		int firstDigit = num; // Initialize firstDigit as the number
		int divisor = 1; // To find the number of digits

		// Loop to find the first digit and divisor
		while (firstDigit >= 10) {
			firstDigit /= 10; // Extract the first digit
			divisor *= 10; // Update divisor to divide the number
		}

		// Remove the first digit and last digit from the number
		int middlePart = (num % 10) / 10;

		return lastDigit * divisor + middlePart * 10 + firstDigit;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int result = reverseFirstLastDigits(num);
		System.out.println(result);
		sc.close();

	}

}
