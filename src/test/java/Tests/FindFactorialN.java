package Tests;

public class FindFactorialN {

	public static void main(String[] args) {
		long factorial = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.print("Factorial of number " + n + " is: " + factorial);

	}

}
