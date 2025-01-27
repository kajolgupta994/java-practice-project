package Tests;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class RecursionFour {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int N = Integer.parseInt(read.readLine());
			Solutio ob = new Solutio();
			System.out.println(ob.sumOfSeries(N));

			System.out.println("~");
		}
	}
}

// } Driver Code Ends

// User function Template for Java

class Solutio {
	int sumOfSeries(int n) {

		if (n <= 0) {
			return 0;
		}

		return (n * n * n) + sumOfSeries(n - 1);
	}
}
