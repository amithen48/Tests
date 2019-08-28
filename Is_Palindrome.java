
public class Is_Palindrome {

	public static boolean isPalindrome(String word) {
		char[] list1 = word.toCharArray();
		char[] list2 = new char[list1.length];
		int j = 0;
		for (int i = list1.length - 1; i >= 0; i--) {
			list2[j] = list1[i];
			j++;
		}
		String text = new String(list2);
		if (text.equalsIgnoreCase(word)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Deleveled"));
	}
}
