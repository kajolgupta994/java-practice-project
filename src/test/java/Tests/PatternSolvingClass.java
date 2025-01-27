package Tests;

import java.util.Scanner;

public class PatternSolvingClass {
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
		for (int i = 1; i <=2 * n - 1; i++) {
				int stars = i;
				if(i>n){
					stars = 2*n -i;
				}
				for (int j = 1; j <= stars; j++) {
					System.out.print("*");
				}
				
				
			
			System.out.println();
		}
	}
	public static void pattern9(int n) {
	int start = 1;
		for (int i = 0; i <n; i++) {
			
				if(i%2==0){
					start = 1;
				}else {
					start = 0;
				}
				for (int j = 0; j <=i; j++) {
					System.out.print(start);
					start = 1- start;
				}
			System.out.println();
		}
	}
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// pattern1(n);
		// pattern2(n);
		// pattern3(n);
		// pattern4(n);
		// pattern5(n);
		// pattern6(n);
		// pattern7(n);
		// pattern8(n);
		pattern9(n);
		sc.close();
	}

}
