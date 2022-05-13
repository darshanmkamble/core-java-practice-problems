package javaquestions;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		// Java Program to Display Fibonacci Series
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int limit = scanner.nextInt();
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i <= limit; i++) {
			System.out.println(num1);
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		scanner.close();
	}

}
