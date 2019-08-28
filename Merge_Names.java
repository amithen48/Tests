import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Names {

	public static String[] uniqueNames(String[] names1, String[] names2) {
		for (int i = 0; i < names1.length; i++) {
			for (int j = 0; j < names2.length; j++) {
				if (names1[i].equalsIgnoreCase(names2[j])) {
					names2[j] = null;
				}
			}
		}

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < names1.length; i++) {
			list.add(names1[i]);
		}
		for (int j = 0; j < names2.length; j++) {
			if (names2[j] != null) {
				list.add(names2[j]);
			}
		}

		String[] names3 = new String[list.size()];
		for (int i = 0; i < names3.length; i++) {
			names3[i] = list.get(i);
		}

		return names3;

	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		String[] names3 = uniqueNames(names1, names2);

		System.out.println(Arrays.toString(names3));

	}
}
