package javaquestions;

public class OctalToDecimalConversion {

	public static void main(String[] args) {
		// Java Program To Convert Octal Number to Decimal Number
		System.out.println(convertOctalToDecimal(1750));
	}

	public static long convertOctalToDecimal(long number) {
		long remainder = 0;
		long decimalNumber = 0;
		double base = 8;
		double power = 0;
		while (number != 0) {
			remainder = number % 10;
			decimalNumber += remainder * Math.pow(base, power);
			number /= 10;
			power++;
		}
		return decimalNumber;
	}
}
