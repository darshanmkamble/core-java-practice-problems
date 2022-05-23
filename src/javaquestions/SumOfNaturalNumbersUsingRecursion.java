package javaquestions;

public class SumOfNaturalNumbersUsingRecursion {

	public static void main(String[] args) {
		// Java Program to Find the Sum of Natural Numbers Using Recursion
		int number = 20;
		int sum = addNumber(number);
		System.out.println("Sum of natural number till " + number + " is " + sum);
	}

	public static int addNumber(int num) {
		if (num != 0) {
			return num + addNumber(num - 1);
		} else
			return num;
	}
}
