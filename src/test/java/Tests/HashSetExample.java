package Tests;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Banana");
		fruits.add(null);
		fruits.add(null);
		System.out.println(fruits);
		
	}

}
