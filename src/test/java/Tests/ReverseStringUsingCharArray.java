package Tests;

public class ReverseStringUsingCharArray {
	public static void main(String args[]) {
		String str = "kajol";
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			System.out.print(charArr[i]);
		}
	}

}
