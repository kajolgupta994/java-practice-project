package Tests;

import java.util.*;

public class RecursionFun1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		R1.sumOfN(n, sum);
		int total = R1.sumOfNum(n);
		System.out.println(total);
		int factorial = R1.facOfNum(n);
		System.out.println(factorial);

	}

}

class R1 {
	public static void sumOfN(int n, int sum) {

		if (n < 1) {
			System.out.println(sum);
			return;
		}
		sumOfN(n - 1, sum + n);

	}

	public static int sumOfNum(int n) {

		if (n < 1) {

			return 0;
		}
		return n + sumOfNum(n - 1);

	}

	public static int facOfNum(int n) {

		if (n < 1) {

			return 1;
		}
		return n * sumOfNum(n - 1);

	}
	
	
}
