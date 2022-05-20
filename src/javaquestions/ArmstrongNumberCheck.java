package javaquestions;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// Java Program to Check Armstrong Number
		int number = 153;
		int actualNumber = number;
		int power = getPower(actualNumber);
		int result = 0;
		int singleDigit = 0;

		while (actualNumber > 0) {
			singleDigit = actualNumber % 10;
			result = result + (int) Math.pow(singleDigit, power);
			actualNumber /= 10;
		}

		if (number == result) {
			System.out.println(number + " is an armstrong number.");
		} else
			System.out.println(number + " isn't an armstrong number.");
	}

	public static int getPower(int number) {
		int power = 0;
		while (number > 0) {
			number /= 10;
			power++;
		}
		return power;
	}
}
