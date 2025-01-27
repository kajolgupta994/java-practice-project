package Tests;

import java.util.Scanner;

public class FindNFibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		int b = 1;
		System.out.print(a + " ");
		if (n <= 0) {
			System.out.println("Invalid input: " + n);
		} else {
			for (int i = 1; i < n; i++) {
				int next = a + b;
				a = b;
				b = next;
				System.out.print(a + " ");
			}

		}

		sc.close();
	}

}
