package javaquestions;

import java.util.Scanner;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		// Java Program to check if a number is Palindrome or Not

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input == reverseANumber(input))
			System.out.println("This is a palindrome number");
		else
			System.out.println("This is not a palindrome number");
		scanner.close();
	}

	public static int reverseANumber(int number) {
		int reverseNum = 0;
		int mod = 0;

		while (number > 0) {
			mod = number % 10;
			reverseNum = reverseNum * 10 + mod;
			number = number / 10;
		}

		return reverseNum;
	}

}
