package Tests;

import java.util.*;

class Output3 {
	public static int StringToInteger(String str) {
		
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			int digit = Character.getNumericValue(str.charAt(i));// Convert each character to its numeric value
			//or
			//int digit = str.charAt(i) - '0';// Subtract ASCII value of '0' (48) to get the digit
			result = result * 10 + digit; // Multiply current result by 10 and add the digit
		}
		return result;
	}
	
	public static int StringToIntegerNegativeValue(String str) {
		int result = 0;
		boolean isNegative = false;
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == '-') {
				isNegative = true;
			} else {
				int digit = c - '0';
				result = result *10 + digit;
			}
			
		}
		if(isNegative) {
			result = -result;
		}
		return result;
		
	}
}

public class StringToIntegerWithoutParsing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//int output = Output3.StringToInteger(str);
		//System.out.println(output);
		int res = Output3.StringToIntegerNegativeValue(str);
		System.out.println(res);
		
	}

}
