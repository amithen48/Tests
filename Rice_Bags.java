package Excriceses;

public class Rice_Bags {

	public static Boolean packageRice(Integer big, Integer small, Integer goal) {

		while (big > 0) {
			if (goal >= 5) {
				goal = goal - 5;
				big--;
			} else {
				break;
			}
		}

		while (small > 0) {
			if (goal >= 1) {
				goal = goal - 1;
				small--;
			} else {
				break;
			}
		}

		if (goal == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		System.out.println(packageRice(2, 1, 10));

	}

}
