package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result5 {

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		List<Integer> result = new ArrayList<>();

		for (String query : queries) {
			int count = 0;
			for (String string : strings) {
				if (query.equals(string)) {
					count++;
				}
			}
			result.add(count);
		}

		return result;

	}
}

public class SparseArray {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output4.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> strings = new ArrayList<>();

		for (int i = 0; i < stringsCount; i++) {
			String stringsItem = bufferedReader.readLine();
			strings.add(stringsItem);
		}

		int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> queries = new ArrayList<>();

		for (int i = 0; i < queriesCount; i++) {
			String queriesItem = bufferedReader.readLine();
			queries.add(queriesItem);
		}

		List<Integer> res = Result5.matchingStrings(strings, queries);

		for (int i = 0; i < res.size(); i++) {
			bufferedWriter.write(String.valueOf(res.get(i)));

			if (i != res.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
