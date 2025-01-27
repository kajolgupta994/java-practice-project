package Tests;

import java.io.*;


class Output5 {

	public static int countingValleys(int steps, String path) {
		int noOfValleysTraversed = 0;
		int elevation = 0;
		for(int i=0; i<path.length();i++) {
			 char step = path.charAt(i);
			 if(step=='U') {
				 elevation++;
			 }else if(step == 'D') {
				elevation--;
			 }
			 
			 if(elevation ==0 && step=='U') {
				 noOfValleysTraversed++;
			 }
			
		}
		
		return noOfValleysTraversed;
	}

}

public class CountingValleys {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String outputPath = System.getenv("OUTPUT_PATH");
		if (outputPath == null) {
			outputPath = "output10.txt";
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = Output5.countingValleys(steps, path);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
