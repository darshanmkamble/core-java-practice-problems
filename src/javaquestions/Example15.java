package javaquestions;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		// Java Program to Generate Multiplication Table
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
		scanner.close();
	}

}
