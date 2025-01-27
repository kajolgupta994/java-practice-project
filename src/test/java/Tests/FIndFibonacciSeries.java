package Tests;

import java.util.*;

public class FIndFibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		int b = 1;
		if (n <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			
			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				int next = a + b;
				a = b;
				b = next;
			}
		}
		
		sc.close();
	}

}