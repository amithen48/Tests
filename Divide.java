package Excriceses;

import java.util.Scanner;

public class Divide {

	private static Scanner input1;
	private static Scanner input2;

	public static void main(String[] args) {

		input1 = new Scanner(System.in);
		input2 = new Scanner(System.in);
		System.out.println("Input the dividend: ");
		int num1 = input1.nextInt();
		System.out.println("Input the divider: ");
		int num2 = input2.nextInt();
		
		float f = (float)num1/num2;
		System.out.println(f);

	}

}
