import java.util.Scanner;

class Cool {
	public static void main(String args[]) {
	Scanner answer = new Scanner(System.in);
	String userInput;
	System.out.println("Do you think you're cool? (Yes/No)");
	userInput = answer.next();
		if(userInput.equals("Yes")){
			System.out.println("Lol");
		} else if (userInput.equals("No")){
			System.out.println("I completely agree");
		} else {
			System.out.println("Idk what you are saying");
		}
	}
}
	