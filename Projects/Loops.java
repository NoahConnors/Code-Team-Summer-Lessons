import java.util.Scanner;

class Loops {
	public static void main(String args[]) {
		Scanner answer = new Scanner(System.in);
		String userInput;
		for (int increasingNumber = 0; increasingNumber < 10; increasingNumber++){
			System.out.println("Would you like to continue? (Yes/No)");
			userInput = answer.next();
			if(userInput.equals("Yes")){
				System.out.println(increasingNumber);
			} else if (userInput.equals("No")){
				System.out.println("Done");
			} else {
				System.out.println("Please choose a different answer.");
			}
		}
	System.out.println("That is the highest number I can count to.");
	}
}