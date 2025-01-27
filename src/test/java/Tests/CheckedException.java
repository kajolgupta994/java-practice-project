package Tests;

class invalidAgeException extends Exception {
	invalidAgeException(String msg) {
		super(msg);
	}

}

public class CheckedException {

	public static void validateAge(int age) throws invalidAgeException {
		if (age < 18) {
			throw new invalidAgeException("Age must be 18 or above");
		}

	}

	public static void main(String[] args) {

		try {
			validateAge(15);
		} catch (invalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
