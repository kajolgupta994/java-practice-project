package Tests;

import java.util.*;

public class PatternsSolving {

	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int stars = i;
			if (i > n) {
				stars = 2 * n - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pattern9(int n) {
		int start = 1;
		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}

	public static void pattern10(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			int itr = 2 * n - (2 * i - 2) - 2;
			for (int j = 0; j < itr; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern11(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 1;
			}

			System.out.println();
		}
	}

	public static void pattern12(int n) {

		for (int i = 0; i < n; i++) {
			int itr = 'A' + i;
			for (char ch = 'A'; ch <= itr; ch++) {
				System.out.print(ch + " ");

			}

			System.out.println();
		}
	}

	public static void pattern13(int n) {

		for (int i = 0; i < n; i++) {
			int itr = 'A' + (n - i);
			for (char ch = 'A'; ch < itr; ch++) {
				System.out.print(ch + " ");

			}

			System.out.println();
		}
	}

	public static void pattern14(int n) {
		char ch = 'A';
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");

			}
			System.out.println();
			ch += 1;
		}
	}

	public static void pattern15(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			int breakPoint = (2 * i + 1) / 2;
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print(ch + " ");
				if (j <= breakPoint) {
					ch++;
				} else {
					ch--;
				}
			}
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
	}

	public static void pattern16(int n) {

		for (int i = 0; i < n; i++) {
			int itr = 'E' - i;
			for (char ch = (char) itr; ch <= 'E'; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void pattern17(int n) {
		int it = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < it; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			it += 2;

			System.out.println();

		}
	}

	public static void pattern18(int n) {
		int it = 2 * n - 2;
		;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < it; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			it -= 2;

			System.out.println();

		}

	}

	public static void pattern19(int n) {

		int spaces = 2 * n - 2;
		for (int i = 1; i <= 2 * n - 1; i++) {
			int stars = i;
			if (i > n) {
				stars = 2 * n - i;
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			if (i < n) {
				spaces -= 2;
			} else {
				spaces += 2;
			}
		}

	}

	public static void pattern20(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static int evenlyDivides(int n) {
		int count = 0;
		int originalNum = n;
		while (n>0) {
			int lastDigit = n % 10;
			n = n / 10;
			
			if(lastDigit == 0){
			    continue;
			}

			if (originalNum % lastDigit == 0) {
				count++;
			}

		}
		return count;
  }

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 * pattern1(n); pattern2(n); pattern3(n); pattern4(n); pattern5(n); pattern6(n);
		 * pattern7(n); pattern8(n); pattern9(n); pattern10(n); pattern11(n);
		 * pattern12(n); pattern13(n); pattern14(n); pattern15(n); pattern16(n);
		 * pattern17(n); pattern18(n); pattern19(n); pattern20(n);
		 */
		
		int number = evenlyDivides(n);
		System.out.println(number);
		sc.close();
	}

}
