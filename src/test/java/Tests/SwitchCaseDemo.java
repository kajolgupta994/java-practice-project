package Tests;

import java.io.*;
import java.util.*;

class SwitchCaseDemo {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		while (t-- > 0) {
			int choice = Integer.parseInt(in.readLine());
			String a[] = in.readLine().trim().split("\\s+");
			List<Double> arr = new ArrayList<Double>();
			for (int i = 0; i < choice; i++)
				arr.add(Double.parseDouble(a[i]));

			CGF ob = new CGF();
			if (choice == 1)
				System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
			else
				System.out.println((int) ob.switchCase(choice, arr));

			System.out.println("~");
		}
	}
}

class CGF {

	static double switchCase(int choice, List<Double> arr) {

		double area = 0;
		switch (choice) {
		case 1:
			double radius = arr.get(0);
			area = Math.PI * radius * radius;
			break;
		case 2:
			double length = arr.get(0);
			double breadth = arr.get(1);
			area = length * breadth;
			break;
		default:
			System.out.println("Invalid choice entered.");
		}
		return area;

	}
}
