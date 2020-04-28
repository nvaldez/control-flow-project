import java.util.Scanner; 

public class ControlFlow {

	public static void main(String[] args) {
		
		AsciiChars.printNumbers(456);
		System.out.println();
		AsciiChars.printLowerCase("TESTING");
		System.out.println();
		AsciiChars.printUpperCase("testing");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = input.nextLine();
		System.out.println("Hello " + name);
		
		boolean again = true;
		
		while(again) {
			System.out.println("Would you like to continue to the interactive portion? ");
			String answer = input.nextLine();
			
			if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
				
				System.out.println(answer);
				again = false;
			}
			else {
				System.out.println("Please return later to complete the survey");
				break;
			}
			System.out.println("testing");
		}

	}

}
