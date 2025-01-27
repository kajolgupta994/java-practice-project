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

class Result6 {

	public static int findMedian(List<Integer> arr) {
		
		Collections.sort(arr);
		/*int getMedianValue = 0;
		int n = arr.size() / 2;
		for (int i = 0; i <= n; i++) {
			getMedianValue = arr.get(i);
		}
		
		return getMedianValue;*/ 
		//or
		int medianIndex = arr.size()/2;
		return arr.get(medianIndex);
	}

}

public class FindMedianNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output5.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = Result6.findMedian(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
