
public class AsciiChars {

	public static void printNumbers(int num) {

		String str = Integer.toString(num);

		for (int i = 0; i < str.length(); i++) {

			int ascii = str.charAt(i);
			System.out.println("The value of " + str.charAt(i) + " is " + ascii);
		}
	}

	public static void printLowerCase(String str) {

		String lowerCase = str.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {

			int ascii = lowerCase.charAt(i);
			System.out.println("The value of " + lowerCase.charAt(i) + " is " + ascii);
		}

	}

	public static void printUpperCase(String str) {
		
		String upperCase = str.toUpperCase();

		for (int i = 0; i < upperCase.length(); i++) {

			int ascii = upperCase.charAt(i);
			System.out.println("The value of " + upperCase.charAt(i) + " is " + ascii);
		}
	}

}
