package Tests;

//Complete this code or write your own from scratch
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class MapDemo {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		Map phoneBook = new HashMap<>();
		for (int i = 0; i < n; i++){
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			phoneBook.put(name, phone);
		}
		
		
		while (in.hasNext()) {
				String s = in.nextLine();
				if(phoneBook.containsKey(s)) {
					System.out.println(s+"="+phoneBook.get(s));
				}else {
					System.out.println("Not found");
				}
			}
			
		
	}
}
