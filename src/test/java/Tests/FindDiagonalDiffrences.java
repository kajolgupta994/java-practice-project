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

class ArrayFindDiagonalDifferece {

	public static int diagonalDifference(List<List<Integer>> arr) {

		int sumOfRightDiagonal = 0;
		int sumOfLeftDiagonal = 0;
		for (int i = 0; i < arr.size(); i++) {
			sumOfRightDiagonal += arr.get(i).get(i);
		}
		for (int i = 0; i < arr.size(); i++) {
			sumOfLeftDiagonal += arr.get(i).get(arr.size() - i - 1);
		}
		int difference = Math.abs(sumOfLeftDiagonal - sumOfRightDiagonal);

		return difference;
	}

}

public class FindDiagonalDiffrences {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "Output9.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = ArrayFindDiagonalDifferece.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
