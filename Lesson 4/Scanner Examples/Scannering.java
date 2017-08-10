import java.util.Scanner;

class Scannering {
	public static void main(String args[]) {
		System.out.println("Hello!");
		Scanner inputTaker = new Scanner(System.in);
		String userInput;
		boolean shouldLoopContinue = true;
		while(shouldLoopContinue) {
			System.out.println("Do you want to end the loop? (Yes/No)");
			userInput = inputTaker.nextLine();
			if(userInput.equals("Yes")) {
				shouldLoopContinue = false;
			} 
		}
		System.out.println("Thanks for looping.");
	}
}