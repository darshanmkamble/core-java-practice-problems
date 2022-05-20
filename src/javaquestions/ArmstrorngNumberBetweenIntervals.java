package javaquestions;

public class ArmstrorngNumberBetweenIntervals {

	public static void main(String[] args) {
		// Display Armstrong numbers between two intervals
		int low = 10;
		int high = 1000;

		while (low < high) {
			if (isArmstrongNumber(low)) {
				System.out.println(low);
			}
			low++;
		}
	}

	public static int getPower(int number) {
		int power = 0;
		while (number > 0) {
			number /= 10;
			power++;
		}
		return power;
	}

	public static boolean isArmstrongNumber(int number) {
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
			return true;
		} else
			return false;
	}

}
