package Tests;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraylistDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		sc.nextLine();
		ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();

		for (int i = 0; i < lines; i++) {
			int nums = sc.nextInt();
			ArrayList<Integer> numbers = new ArrayList<>();
			for (int j = 0; j < nums; j++) {
				numbers.add((sc.nextInt()));
			}
			listArray.add(numbers);
			sc.nextLine();

		}

		int queries = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < queries; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			sc.nextLine();
			if (x < listArray.size() && y < listArray.get(x).size()) {
				System.out.println(listArray.get(x).get(y));
			} else {
				System.out.println("ERROR!");
			}
		}

	}

}
