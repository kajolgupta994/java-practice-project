package Tests;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class FineSizeOfDataTypes {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			sc.nextLine();
			String s = sc.next();
			Solution obj = new Solution();
			int ans = obj.dataTypeSize(s);
			String Character = "Character";
			if (Character.equals(s) && ans == 2) {
				ans = 1;
			}
			System.out.println(ans);

			System.out.println("~");
		}
	}
}

class Solution {
	static int dataTypeSize(String str) {
		int bytes = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.equalsIgnoreCase("boolean") || str.equalsIgnoreCase("Boolean")) {
				bytes = 1;
			}else if(str.equalsIgnoreCase("byte") || str.equalsIgnoreCase("Byte")) {
				bytes = 1;
			}else if(str.equalsIgnoreCase("short") || str.equalsIgnoreCase("Short")) {
				bytes = 2;
			}else if(str.equalsIgnoreCase("int") || str.equalsIgnoreCase("Integer")) {
				bytes = 4;
			}else if(str.equalsIgnoreCase("long") || str.equalsIgnoreCase("Long")) {
				bytes = 8;
			}else if(str.equalsIgnoreCase("float") || str.equalsIgnoreCase("Float")) {
				bytes = 4;
			}else if(str.equalsIgnoreCase("double") || str.equalsIgnoreCase("Double")) {
				bytes = 8;
			}else if(str.equalsIgnoreCase("char") || str.equalsIgnoreCase("Character")) {
				bytes = 2;
			}
		}
		return bytes;
	}
}
