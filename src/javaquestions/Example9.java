package javaquestions;

public class Example9 {

	public static void main(String[] args) {
		// Java Program to Find the Largest Among Three Numbers
		int a = 700;
		int b = 500;
		int c = 300;

		if (a > b && a > c) {
			System.out.println("a is the greatest");
		} else if (b > c) {
			System.out.println("b is the greatest");
		} else {
			System.out.println("c is the greatest");
		}

		if (a >= b) {
			if (a >= c) {
				System.out.println("a is the greatest");
			} else {
				System.out.println("c is the greatest");
			}
		} else {
			if (b >= c) {
				System.out.println("b is the greatest");
			} else {
				System.out.println("c is the greatest");
			}
		}
	}

}
