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

class Result9 {

	public static long flippingBits(long n) {
		
		 
		 long longMaxUnsiged32Bit = 4294967295L ;
		 
		return longMaxUnsiged32Bit -n;
		 
	}

}

public class FlippingBits {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "Output8.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				long n = Long.parseLong(bufferedReader.readLine().trim());

				long result = Result9.flippingBits(n);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
