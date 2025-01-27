package Tests;

public class ReverseStringUsingTwoPointerApproach {

	public static void main(String[] args) {
		String str = "kajol";
		char[] charArr = str.toCharArray();
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}
		System.out.print(new String(charArr));

	}

}
