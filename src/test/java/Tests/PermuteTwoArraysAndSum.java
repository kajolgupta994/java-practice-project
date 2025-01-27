package Tests;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class TwoArrays {

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
		String str = "YES";
		int[] arr = new int[A.size()];
		for (int i = 0; i < A.size(); i++) {
			arr[i] = A.get(i);
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}

		return str;

	}

}

public class PermuteTwoArraysAndSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output13.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int n = Integer.parseInt(firstMultipleInput[0]);

				int k = Integer.parseInt(firstMultipleInput[1]);

				List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList());

				List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList());

				String result = TwoArrays.twoArrays(k, A, B);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
