package javaquestions;

import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		// Java Program to Find Factorial of a Number
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int factorial = getFactorial(number);
		System.out.println("The factorial of " + number + " is " + factorial);
		scanner.close();
	}

	public static int getFactorial(int number) {
		if (number == 0)
			return 1;
		else
			return number * getFactorial(number - 1);
	}
}
