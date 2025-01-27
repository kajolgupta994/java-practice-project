package Tests;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.put(1, "Banana");
		fruits.put(2, "Kiwi");
		fruits.put(3, "Banana");
		fruits.put(4, null);
		fruits.put(5, null);
		fruits.put(1, "Grapes");
		System.out.println(fruits);

	}

}
