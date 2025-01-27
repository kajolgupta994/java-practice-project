package Tests;

import java.util.*;



public class findLargestElements {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		int largest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]> largest) {
				largest = arr[i];
			} 
		}
		System.out.println(largest);
	}
}
