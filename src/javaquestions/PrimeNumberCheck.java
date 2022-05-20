package javaquestions;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// Java Program to Check Whether a Number is Prime or Not
		int num = 1;
		boolean flag = false;
		if (num == 1) {
			flag = true;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}

}
