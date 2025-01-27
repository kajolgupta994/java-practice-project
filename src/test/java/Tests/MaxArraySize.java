package Tests;

public class MaxArraySize {
	public static void main(String[] args) {
		try {
			int size = Integer.MAX_VALUE; // Start with the theoretical max
			while (size > 0) {
				try {
					int[] testArray = new int[size];
					System.out.println("Maximum array size possible: " + size);
					break;
				} catch (OutOfMemoryError e) {
					size /= 2; // Reduce size by half and try again
				}
			}
		} catch (Exception e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
	}
}
