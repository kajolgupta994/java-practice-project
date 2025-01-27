package Tests;

import java.util.*;

public class ArrayListDemoClass {
	public static void main(String args[]) {
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(Arrays.asList(11, 2, 4));
		arr.add(Arrays.asList(4, 5, 6));
		arr.add(Arrays.asList(10, 8, -12));
		int leftToRighDiagnolanSum = 0;
		int rightToLeftDiagnolanSum = 0;
		/*
		 * for (int i = 0; i < arr.size(); i++) {
		 * 
		 * List<Integer> row = arr.get(i); for (int j = 0; j < row.size(); j += 3) {
		 * leftToRighDiagnolanSum = leftToRighDiagnolanSum + row.get(j+i);
		 * 
		 * }
		 * 
		 * }System.out.println(leftToRighDiagnolanSum);
		 * 
		 * for (int i = 0; i<arr.size(); i++) {
		 * 
		 * List<Integer> row = arr.get(i); for (int j = row.size()-1; j > 0 ; j-=3) {
		 * 
		 * righToLeftDiagnolanSum = righToLeftDiagnolanSum + row.get(j-i);
		 * 
		 * }
		 * 
		 * }System.out.println(righToLeftDiagnolanSum);
		 * 
		 * int findDifferenceBetweenDiagonalSums = righToLeftDiagnoalSum -
		 * leftToRighDiagnoalSum; System.out.println(findDifferenceBetweenDiagonalSums);
		 */

		// or

		for (int i = 0; i < arr.size(); i++) {
			leftToRighDiagnolanSum += arr.get(i).get(i);
		}
		int size = arr.size();
		for (int i = 0; i < size; i++) {
			int j = size - i - 1;
			rightToLeftDiagnolanSum += arr.get(i).get(j);
		}
		int difference = Math.abs(leftToRighDiagnolanSum - rightToLeftDiagnolanSum);
		System.out.println(difference);

	}

}
