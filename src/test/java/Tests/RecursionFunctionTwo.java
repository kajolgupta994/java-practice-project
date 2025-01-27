package Tests;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class RecursionFunctionTwo {
	// Driver code
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			Solut obj = new Solut();
			obj.printGfg(n);
			System.out.println();

			System.out.println("~");
		}
	}
}
//} Driver Code Ends

class Solut {

	void printGfg(int N) {
		if (N == 0) {
			return;
		}
		printGfg(N - 1);
		System.out.print("GFG" + " ");
	}
}
