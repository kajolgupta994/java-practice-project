package RecursionPack;

import java.util.Scanner;

public class RecursiveFibonacci {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int last = fibonacci(n - 1);
		int sLast = fibonacci(n - 2);
		return last + sLast;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fibonacci(n);
		System.out.println(result);
		sc.close();

	}

}
