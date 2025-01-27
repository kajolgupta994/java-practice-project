package Tests;

public class RevString {

	public static void main(String[] args) {
		String str = "Madam";
		String revStr = "";
		str = str.toLowerCase();
		for (int i = str.toLowerCase().length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (str.equals(revStr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
