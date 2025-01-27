package Tests;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse = 0;
		int num = 123;
		while (num > 0) {
			int digit = num % 10; // Extract the last digit
			reverse = reverse * 10 + digit; // Append the digit
			num /= 10; // Remove the last digit
		}
		System.out.println(reverse); // Output: 321
		
		int nums = 123;
		String numStr = Integer.toString(nums); // Convert to String

		for (char ch : numStr.toCharArray()) {
		    System.out.println(ch); // Prints each character
		}
	}

}
