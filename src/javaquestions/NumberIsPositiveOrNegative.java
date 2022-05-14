package javaquestions;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {
		// Java Program to Check Whether a Number is Positive or Negative
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double number = scanner.nextDouble();
		if (number < 0.0)
			System.out.println(number + " is a negative number.");
		else if (number > 0.0)
			System.out.println(number + " is a positive number.");
		else
			System.out.println(number + " is zero.");
		scanner.close();
	}

}
