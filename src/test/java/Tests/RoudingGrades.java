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

class Result8 {

	public static List<Integer> gradingStudents(List<Integer> grades) {

		List<Integer> result = new ArrayList<>();

		for (int grade : grades) {
			if (grade < 38) {
				result.add(grade);
			} else {

				int nextMultipleOfFive = ((grade / 5) + 1) * 5;
				if (nextMultipleOfFive - grade < 3) {
					result.add(nextMultipleOfFive);
				} else {
					result.add(grade);
				}
			}

		}
		return result;

	}
}

public class RoudingGrades {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "Output7.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = Result8.gradingStudents(grades);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
