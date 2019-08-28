package Excriceses;

import java.util.ArrayList;

public class Fibonachi_Sum {

	public static int fibSum(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int sum = 0;
		for (int i = 2; i < n; i++) {

			list.add(list.get(i - 1) + list.get(i - 2));
			if (list.get(i) % 2 == 0) {
				sum = sum + list.get(i);
			}
		}

		return sum;

	}

	public static void main(String[] args) {

		System.out.println(fibSum(10));

	}

}
