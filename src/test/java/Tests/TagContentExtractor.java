package Tests;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			for (int i = 0; i < testCases; i++) {
				String line = in.nextLine();
				String regex = "<(.+?)>([^<]+)</\\1>";
				Pattern p = Pattern.compile(regex);

				Matcher m = p.matcher(line);
				boolean found = false;

				while (m.find()) {
					System.out.println(m.group(2));
					found = true;
				}
				if (!found) {
					System.out.println("None");
				}
				testCases--;
			}
		}
	}
}
