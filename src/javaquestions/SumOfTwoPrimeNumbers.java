package javaquestions;

public class SumOfTwoPrimeNumbers {

	public static void main(String[] args) {
		// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime
		// Numbers
		int number = 34;
		boolean flag = false;

		for (int i = 2; i <= number / 2; i++) {
			if (isPrime(i)) {
				if (isPrime(number - i)) {
					System.out.println(number + " = " + i + " + " + (number - i));
					flag = true;
				}
			}
		}

		if (!flag)
			System.out.println(number + " cannot be expressed as a sum of two numbers.");
	}

	public static boolean isPrime(int number) {
		boolean flag = true;
		if (number == 1) {
			flag = true;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
