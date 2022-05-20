package javaquestions;

public class PrimeNumbersWithInterval {

	public static void main(String[] args) {
		// Java Program to Display Prime Numbers Between Two Intervals
		int low = 20;
		int high = 50;

		while (low < high) {
			boolean flag = false;
			for (int i = 2; i <= low / 2; i++) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(low);
			low++;
		}
	}
}
