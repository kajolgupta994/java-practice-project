package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Output6 {

	public static String pangrams(String s) {

		s = s.toLowerCase();

		// Use the HashSet to track unique alphabetic characters
		HashSet<Character> uniqueChars = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (Character.isLetter(currentChar)) {
				uniqueChars.add(currentChar);
			}
		}

		return uniqueChars.size() == 26 ? "pangram" : "not pangram";

	}
}

public class Pangram {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output11.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		String s = bufferedReader.readLine();

		String result = Output6.pangrams(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
