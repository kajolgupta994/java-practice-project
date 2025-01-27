package RecursionPack;

public class RecursionDemo {
	public static void methodA(int count) {
		if (count == 3) {
			return;
		}

		System.out.print(count + " ");
		methodA(count + 1); // Pass incremented count to the next recursive call
	}

	public static void main(String[] args) {
		RecursionDemo.methodA(0); // Start with count = 0
	}
}
