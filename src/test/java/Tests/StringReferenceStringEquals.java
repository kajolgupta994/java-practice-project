package Tests;

public class StringReferenceStringEquals {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = new String("Hello");
		if(str == str2) {
			System.out.println("Reference are equal");
		}else if(str.equalsIgnoreCase(str2)) {
			System.out.println("Strings are equal");
		}

	}

}
