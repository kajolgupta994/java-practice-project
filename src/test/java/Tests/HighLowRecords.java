package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result3 {

	public static List<Integer> breakingRecords(List<Integer> scores) {

		int highScore = scores.get(0);
		int lowScore = scores.get(0);
		int maxCount = 0;
		int minCount = 0;

		for (int i = 1; i < scores.size(); i++) {
			if (scores.get(i) > highScore) {
				highScore = scores.get(i);
				maxCount++;
			} else if (scores.get(i) < lowScore) {
				lowScore = scores.get(i);
				minCount++;
			}
		}

		return Arrays.asList(maxCount, minCount);
	}

}

public class HighLowRecords {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output2.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> scores = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresTemp[i]);
			scores.add(scoresItem);
		}

		List<Integer> result = Result3.breakingRecords(scores);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
