package view;

import java.util.Scanner;
import controller.DigitController;

public class Principal {

	public static void main(String[] args) {
		DigitController dController = new DigitController();
		Scanner in = new Scanner(System.in);
		int number, digit;
		
		do {
			System.out.println("Write a number between 10 and 999999:");
			number = in.nextInt();
			System.out.println("Write other number between 0 and 9:");
			digit = in.nextInt();
		} while(number<10 || number>999999 || digit<0 || digit>9);
		in.close();
		
		int digitCount = dController.digitContains(number, digit);
		System.out.println(digitCount);
	}

}
