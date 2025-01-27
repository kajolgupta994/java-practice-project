package Tests;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class PassByValueReference {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			PassBy obj = new PassBy();
			int ans[] = obj.passedBy(n, m);

			System.out.println(ans[0] + " " + ans[1]);

			System.out.println("~");
		}
	}
}

class PassBy {
	static int[] passedBy(int a, int b) {
		a+=1;
		b+=2;
		
		return new int[]{a,b};
	}
}
