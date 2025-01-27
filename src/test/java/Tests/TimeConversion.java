package Tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result2 {

	public static String timeConversion(String s) {

		SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
		SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

		Date date = null;
		try {
			date = inputFormat.parse(s);

		} catch (ParseException e) {

			e.printStackTrace();
		}
		String output = outputFormat.format(date);
		return output;

	}

}

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output.txt"; 
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		String s = bufferedReader.readLine();

		String result = Result2.timeConversion(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
