package Tests;

import java.util.Scanner;


class MyCalculatorr {
	public long power(int num, int power) throws Exception {
		if (num == 0 && power == 0) {
			throw new Exception("n and p should not be zero.");
		}
		if (num < 0 || power < 0) {
			throw new Exception("n or p should not be negative.");
		}
		
		int powValue = 1;
		
		for (int i = 1; i <= power; i++) {
			
			powValue = powValue * num;
		}
		return powValue;
	}

}

public class ExceptionHandling {
	public static final MyCalculatorr my_calculator = new MyCalculatorr();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
