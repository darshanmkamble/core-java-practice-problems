package javaquestions;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		// Java Program to Convert Decimal Number to Binary Number
		System.out.println(convertDecimalToBinary(155));
	}

	public static long convertDecimalToBinary(long number) {
		long remainder;
		// StringBuffer binary = new StringBuffer();
		long binaryNumber = 0;
		int i = 1;
		while (number != 0) {
			remainder = number % 2;
			// binary.append(remainder);
			number = number / 2;
			binaryNumber += remainder * i;
			i *= 10;
		}
		// return binary.toString();
		return binaryNumber;
	}

}
