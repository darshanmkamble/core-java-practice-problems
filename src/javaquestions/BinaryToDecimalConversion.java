package javaquestions;

public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		// Java Program to Convert Binary Number to Decimal Number
		long binaryNumber = 10100101;
		System.out.println(convertBinaryToDecimal(binaryNumber));
	}

	public static int convertBinaryToDecimal(long number) {
		int decimalNumber = 0;
		double base = 2;
		double power = 0;
		long remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			decimalNumber += remainder * Math.pow(base, power);
			power++;
		}
		return decimalNumber;
	}

}
