package javaquestions;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// Java Program to Check Leap Year
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a year: ");
		int year = scanner.nextInt();
		boolean isLeapYear = false;
		if (year % 4 != 0) {
			isLeapYear = false;
		} else if (year % 100 != 0) {
			isLeapYear = true;
		} else if (year % 400 != 0) {
			isLeapYear = false;
		} else
			isLeapYear = true;

		if(isLeapYear)
			System.out.println("It is a leap year!");
		else 
			System.out.println("It is a common year!");
		scanner.close();
	}

}
