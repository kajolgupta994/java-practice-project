package Tests;

import java.util.*;
import java.io.*;

public enum EnumDataTypes {
	CHARACTER(2), INTEGER(4), LONG(8), FLOAT(4), DOUBLE(8);

	private final int size;

	EnumDataTypes(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	public static int dataTypeSize(String str) {
		try {
			return EnumDataTypes.valueOf(str.toUpperCase()).getSize();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid datatype: " + str);
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			sc.nextLine();
			String s = sc.next();
			//Solution obj = new Solution();
			int ans = dataTypeSize(s);
			String Character = "Character";
			if (Character.equals(s) && ans == 2) {
				ans = 1;
			}
			System.out.println(ans);

		}
	}

}
