package Tests;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> lists = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			lists.add(sc.nextInt());
		}

		int noOfQuery = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= noOfQuery; i++) {
			String query = sc.nextLine();

			if (query.contains("Insert")) {
				String[] parts = sc.nextLine().split(" ");
				int index = Integer.parseInt(parts[0]);
				int element = Integer.parseInt(parts[1]);

				lists.add(index, element);

			} else if (query.contains("Delete")) {
				int index = Integer.parseInt(sc.nextLine());
				lists.remove(index);

			}
		}
		for (Integer list : lists) {
			System.out.print(list+" ");
		}
	}
}
