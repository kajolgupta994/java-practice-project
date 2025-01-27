package Tests;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class RecursionFunctionThree {
	// Driver code
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int N = Integer.parseInt(br.readLine().trim());
			Soluti obj = new Soluti();
			obj.printNos(N);
			System.out.println();

			System.out.println("~");
		}
	}
}
//} Driver Code Ends

class Soluti {

	void printNos(int N) {
		if (N == 0) {
			return;
		}

		System.out.print(N + " ");
		printNos(N - 1);
	}
}
