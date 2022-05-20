package javaquestions;

public class PowerOfANumber {

	public static void main(String[] args) {
		// Java Program to Calculate the Power of a Number
		int base = 2;
		int exponent = 4;

		long result = 1;

		while (exponent != 0) {
			result *= base;
			--exponent;
		}

		System.out.println(result);
	}

}
