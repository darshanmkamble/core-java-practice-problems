package javaquestions;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		// Java Program to Check Whether a Number is Even or Odd
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number is even!");
		} else {
			System.out.println("The number is odd!");
		}
		scanner.close();
	}
}
