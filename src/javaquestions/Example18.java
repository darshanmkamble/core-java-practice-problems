package javaquestions;

import java.util.Scanner;

public class Example18 {

	public static void main(String[] args) {
		// Java Program to Count Number of Digits in an Integer
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int total = 0;
		while (number != 0) {
			number = number / 10;
			++total;
		}
		System.out.println("Number of digits: " + total);
		scanner.close();
	}

}
