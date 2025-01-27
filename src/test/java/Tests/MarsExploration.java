package Tests;

import java.io.*;

class Output7 {

	public static int marsExploration(String s) {
		int missingLetter = 0;
		String sos = "SOS";

		for (int i = 0; i < s.length(); i++) {
			char ss = sos.charAt(i % 3);
			if (s.charAt(i) != ss) {
				missingLetter++;
			}

		}

		return missingLetter;
	}

}

public class MarsExploration {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "Output12.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		String s = bufferedReader.readLine();

		int result = Output7.marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
