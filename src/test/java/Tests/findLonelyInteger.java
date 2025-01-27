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

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result7 {

	public static int lonelyinteger(List<Integer> a) {

		/*int result = 0;
		for (int i : a) {

			result ^= i;
		}
		return result;*/
		//or
		
		
		for(int i = 0; i<a.size(); i++) {
			int count = 0;
			for(int j = 0; j<a.size(); j++) {
				if(a.get(i).equals(a.get(j))) {
					count++;
				}
				
			}
			if(count==1) {
				return a.get(i);
			}
		}
		return -1;
	}

}

public class findLonelyInteger {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "Output6.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());
		int result = Result7.lonelyinteger(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();

	}
}
