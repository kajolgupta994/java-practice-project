package Tests;

import java.util.*;

public class StarPrint {
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
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void pattern8(int n) {
		int counterValue = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 2 * n - i - counterValue; k > 0; k--) {
				System.out.print("*");
			}
			counterValue++;
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}

	public static void pattern9(int n) {

		for (int i = 0; i <= n * 2 - 1; i++) {
			int stars = i;
			if (i > n) {
				stars = 2 * n - i;
			}
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern10(int n) {
		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(start + " ");
				start = 1 - start;
			}
			System.out.println();
		}

	}

	public static void pattern11(int n) {
		int space = 2 * (n - 2);
		for (int i = 1; i < n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int k = 1; k <= space; k++) {
				System.out.print(" ");

			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}

			System.out.println();
			space = space - 2;
		}
	}

	public static void pattern12(int n) {
		int num = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(num);
				num = num + 1;
			}

			System.out.println();

		}

	}

	public static void pattern13(int n) {

		for (int i = 0; i < n; i++) {
			/*
			 * Approach01 char c = 'A' for(int j = 0; j<=i; j++) { System.out.print(ch); c =
			 * (char) (c + 1); }
			 */

			// Approach02
			for (char ch = 'A'; ch <= 'A' + i; ch++) {
				System.out.print(ch);
			}
			System.out.println();

		}

	}

	public static void pattern14(int n) {

		for (int i = 0; i < n; i++) {

			for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
				System.out.print(ch);
			}
			System.out.println();

		}

	}

	public static void pattern15(int n) {

		for (int i = 0; i < n; i++) {
			char ch = (char) ('A' + i);
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);

			}
			System.out.println();

		}

	}

	public static void pattern16(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			int breakPoint = (2 * i + 1) / 2;
			for (int j = 1; j <= 2 * i + 1; j++) {
				System.out.print(ch);
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

	public static void pattern17(int n) {

		for (int i = 0; i < n; i++) {

			for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

	public static void pattern18(int n) {
		int in = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < in; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}

			System.out.println();
			in += 2;
		}

	}

	public static void pattern19(int n) {
		int in = 2 * n - 2;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = in; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
			in -= 2;
		}

	}

	public static void pattern20(int n) {
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

	public static void pattern21(int n) {

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

	public static void pattern22(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {

			for (int j = 0; j < 2 * n - 1; j++) {
				int top = i;
				int left = j;
				int right = (2 * n - 2) - j;
				int down = (2 * n - 2) - i;
				System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
			}
			System.out.println();

		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern1(n);
		System.out.println();
		pattern2(n);
		System.out.println();
		pattern3(n);
		System.out.println();
		pattern4(n);
		System.out.println();
		pattern5(n);
		System.out.println();
		pattern6(n);
		System.out.println();
		pattern7(n);
		System.out.println();
		pattern8(n);
		System.out.println();
		pattern9(n);
		System.out.println();
		pattern10(n);
		System.out.println();
		pattern11(n);
		System.out.println();
		pattern12(n);
		System.out.println();
		pattern13(n);
		System.out.println();
		pattern14(n);
		System.out.println();
		pattern15(n);
		System.out.println();
		pattern16(n);
		System.out.println();
		pattern17(n);
		System.out.println();
		pattern18(n);
		System.out.println();
		pattern19(n);
		System.out.println();
		pattern20(n);
		System.out.println();
		pattern21(n);
		System.out.println();
		pattern22(n);

	}

}
