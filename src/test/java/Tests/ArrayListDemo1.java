package Tests;

import java.util.*;


public class ArrayListDemo1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int items = sc.nextInt();
			arr.add(items);
		}
		Collections.sort(arr);
		int largest = arr.get(n-2);
		int secondLargest = 0;
		for(int i = n-2; i>=0; i--) {
			if(largest != arr.get(i)) {
				 secondLargest = arr.get(i);
				 break;
			}
		}
		System.out.println(secondLargest);
	}

}
