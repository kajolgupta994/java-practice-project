package Tests;

import java.io.*;
import java.util.*;

public class PlaindromeRecursion {

	public boolean isPalindrome(String s) {
		String rev = " ";
		s = s.toLowerCase();
		String delims = "\\W+"; // split any non word
		String[] tokens = s.split(delims);
		for (int i = 0; i<tokens.length; i++) {
			
			rev = rev +tokens.toString().charAt(i);
			
		}
		
		if(s == rev) {
		return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		PlaindromeRecursion p = new PlaindromeRecursion();
		boolean b = p.isPalindrome(str);
		System.out.println((b) ? "true" : "false");

	}
}
