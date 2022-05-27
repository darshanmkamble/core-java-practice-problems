package javaquestions;

public class DecimalToOctalConversion {

	public static void main(String[] args) {
		// Java Program To Convert Decimal Number To Octal Number
		System.out.println(convertDecimalToOctal(1000));
	}

	public static long convertDecimalToOctal(long number) {
		long octalNumber = 0;
		long i = 1;
		while (number != 0) {
			octalNumber += (number % 8) * i;
			number /= 8;
			i *= 10;
		}
		return octalNumber;
	}
}
