package javaquestions;

public class FactorsOfANumber {

	public static void main(String[] args) {
		// Java Program to Display Factors of a Number
		int number = 60;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

}
