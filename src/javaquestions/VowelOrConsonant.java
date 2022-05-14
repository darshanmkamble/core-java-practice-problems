package javaquestions;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// Java Program to Check Whether an Alphabet is Vowel or Consonant

		// vowels = a,e,i,o,u
		char ch = 'z';
		if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
			System.out.println(ch + " is a vowel");
		} else
			System.out.println(ch + " is a consonant");

	}

}
