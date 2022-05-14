package javaquestions;

import java.util.Scanner;

public class IsInputCharacterAlphabetOrNot {

	public static void main(String[] args) {
		// Java Program to Check Whether a Character is Alphabet or Not
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a character: ");
		char input = scanner.next().charAt(0);
		if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
			System.out.println(input + " is an alphabet");
		else
			System.out.println(input + " isn't an alphabet.");
		scanner.close();
	}

}
