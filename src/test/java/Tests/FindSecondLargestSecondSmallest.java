package Tests;

import java.util.*;

class Output{
	public static int sLargestElement(int[]arr, int n) {
		int largest = arr[0];
		int sLargest = -1;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>largest) {
				sLargest = largest;
				largest = arr[i];
			} else if(arr[i]<largest && arr[i]>sLargest) {
				sLargest = arr[i];
			}
		}
		return sLargest;
	}
	
	public static int sSmallestElement(int[]arr, int n) {
		int smallest = arr[0];
		int sSmallest = Integer.MAX_VALUE;
		for(int i=0; i<n;i++) {
			if(arr[i]<smallest) {
				sSmallest = smallest;
				smallest = arr[i];
			} else if(arr[i]!=smallest && arr[i]<sSmallest) {
				sSmallest = arr[i];
			}
		}
		return sSmallest;
	}
	
}

public class FindSecondLargestSecondSmallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i =0; i<n; i++) {
			ar[i] = sc.nextInt();
			
		}
		sc.close();
		int sLargest = Output.sLargestElement(ar, n);
		int sSmallest = Output.sSmallestElement(ar, n);
		System.out.println(sSmallest+" "+sLargest);
	}

}
