package javaquestions;

public class Example6 {

	public static void main(String[] args) {
		// Java Program to Swap Two Numbers
		int a = 10;
		int b = 20;
		System.out.println("Before swapping:");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		// with temp variable
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping:");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		// without temp variable
		System.out.println("Before swapping:");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		a = a + b; // 20+10=30
		b = a - b; // 30-10=20
		a = a - b; // 30-20=10
		System.out.println("After swapping:");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}

}
