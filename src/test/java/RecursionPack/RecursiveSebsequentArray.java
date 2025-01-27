package RecursionPack;

import java.util.*;

public class RecursiveSebsequentArray {
	public static void SubsequentElements(int i, ArrayList<Integer> list, int[] arr, int n) {
		if (i == n) {
			for (int num : list) {
				System.out.print(num+" ");
			}

			if (list.size() == 0) {
				System.out.print("{}");
			}
			System.out.println();
			return;
		}

		// Not pick condition (excluding the element)
		SubsequentElements(i + 1, list, arr, n);

		// Pick condition (including the element)
		list.add(arr[i]);
		SubsequentElements(i + 1, list, arr, n);
		list.remove(list.size()-1);

	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2 };
		int n = 3;
		ArrayList<Integer> list = new ArrayList<>();
		SubsequentElements(0, list, arr, n);

	}

}
