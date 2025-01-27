package RecursionPack;

import java.util.Scanner;

public class PrintNamesSumFactorialNumbers {
	public static void printNames(int count) {
		if (count == 3) {
			return;
		}

		System.out.print("Kajol" + " ");
		printNames(count + 1); // Pass incremented count to the next recursive call

	}

	public static void printOneToN(int n) {

		if (n <= 0) {
			return;
		}

		printOneToN(n - 1);
		System.out.print(n + " ");
	}

	public static void printNToOne(int n) {

		if (n <= 0) {
			return;
		}
		System.out.print(n + " ");
		printNToOne(n - 1);

	}

	public static void sumOfN(int sum, int n) {

		if (n <= 0) {
			System.out.print("\nSum of n numbers is: " + sum);
			return;
		}

		sumOfN(sum + n, (n - 1));

	}

	public static int sumOfNumners(int n) {

		if (n <= 0) {

			return 0;
		}

		return n + sumOfNumners(n - 1);

	}
	public static int factorialOfN(int n) {

		if (n <= 0) {

			return 1;
		}

		return n * factorialOfN(n - 1);

	}

	public static void main(String[] args) {

		System.out.println("Print names n times: ");
		printNames(0);
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		System.out.print("Numbers from 1 to n: ");
		printOneToN(n);
		
		System.out.print("\nNumbers from n to 1: ");
		printNToOne(n);
		
		
		int sum = 0;
		sumOfN(sum, n);		

		
		int result = sumOfNumners(n);
		System.out.print("\nSum of n numbers is: " + result);
		
		
		int factorial = factorialOfN(n);
		System.out.print("\nFactorial of n numbers is: " + factorial);
		
		sc.close();
		
	}

}
