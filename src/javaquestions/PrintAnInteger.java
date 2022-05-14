package javaquestions;

import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) {
		// Java Program to Print an Integer (Entered by the User)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Entered number is: " + num);
		sc.close();
	}

}
