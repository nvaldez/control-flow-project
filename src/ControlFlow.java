import java.util.Scanner; 

public class ControlFlow {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String pet;
		int petAge;
		int luckyNumber;
		String quarterback;
		int jerseyNumber = 0;
		int vehicleModel;
		String favoriteActor;
		int randomNumber;
		
		AsciiChars.printNumbers(456);
		System.out.println();
		AsciiChars.printLowerCase("TESTING");
		System.out.println();
		AsciiChars.printUpperCase("testing");
		
		
		System.out.print("\nWhat is your name? ");
		String name = input.nextLine();
		System.out.println("\nHello " + name + "\n");
		
		boolean again = true;
		
		while(again) {
			System.out.print("Would you like to continue to the interactive portion? "
					+ "\nPlease type (yes/y) to continue or (no/n) to exit: ");
			String answer = input.nextLine();
			
			if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
				
				if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
					
					System.out.println("\nAwesome! Please answer the following questions to find out your lucky numbers!!!!\n");
					
					System.out.print("What is the name of your favorite pet?: ");
					pet = input.nextLine();
					
					System.out.print("What is the age of your favorite pet?: ");
					petAge = input.nextInt();
					input.nextLine();
					
					System.out.print("What is your lucky number?: ");
					luckyNumber = input.nextInt();
					input.nextLine();
					
					System.out.print("Do you have a favorite quarterback? (yes/y): ");
					quarterback = input.nextLine();
					
					if(quarterback.equalsIgnoreCase("yes") || quarterback.equalsIgnoreCase("y")) {
						System.out.print("\nWhat is your quarterback jersey number?: ");
						jerseyNumber = input.nextInt();
						input.nextLine();	
					}
					
					System.out.print("What is the two-digit model year of your vehicle?: ");
					vehicleModel = input.nextInt();
					input.nextLine();
					
					System.out.print("What is the first name of your favorite actor or actress?: ");
					favoriteActor = input.nextLine();
					
					System.out.println("Please enter a random number between 1 and 50: ");
					randomNumber = input.nextInt();
					input.nextLine();
					
					if(randomNumber < 0 || randomNumber > 50) {
						
						while(randomNumber < 0 || randomNumber > 50) {
							System.out.println("The random number needs to be between 1 and 50");
							System.out.println("Please enter a random number between 1 and 50: ");
							randomNumber = input.nextInt();
							input.nextLine();
						}
					}
					
					System.out.println("\npet: " + pet + "\nlucky number: " + luckyNumber + "\nquarterback: " 
					+ quarterback + "\njersey number: " + jerseyNumber + "\nvehicle model: " + vehicleModel
					+ "\nfavorite actor: " + favoriteActor + "\nrandomNumber: " + randomNumber);
					
				}
				else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
					System.out.println("\nPlease return later to complete the survey");
					again = false;
				}
				
			}
			else {
				System.out.println("\nWrong answer\n");
//				break;
			}
		}

	}

}
