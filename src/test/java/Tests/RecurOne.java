package Tests;

import java.util.*;

public class RecurOne {
	public void printName(int n) {
		if (n == 0) {
			return;
		}
		printName(n - 1);
		System.out.print(n+" ");

		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RecurOne r = new RecurOne();

		r.printName(n);
		sc.close();
	}

}
