package javaquestions;

import java.util.Scanner;

public class Example19 {

	public static void main(String[] args) {
		// Java Program to Reverse a Number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int reverseNumber = 0;
		while (number != 0) {
			int n = number % 10;
			reverseNumber = reverseNumber * 10 + n;
			number = number / 10;
		}
		System.out.println("Reversed Number is: " + reverseNumber);
		scanner.close();
	}

}
