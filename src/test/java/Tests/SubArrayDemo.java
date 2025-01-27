package Tests;
import java.util.*;

public class SubArrayDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		int negativeCount = 0;
		
		for(int start = 0;start<n; start++) {
			int sum = 0;
			for(int end =start;end<n; end++) {
				sum = sum + arr[end];
				if(sum<0) {
					negativeCount++;
				}
			}
		}
		System.out.println(negativeCount);
		
	}

}
