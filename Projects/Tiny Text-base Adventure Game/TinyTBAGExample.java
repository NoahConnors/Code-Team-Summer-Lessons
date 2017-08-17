import java.util.Scanner;

class TinyTBAGExample {
	public static void main(String args[]) {
		int playerHealth = 10;
		int enemyHealth = 7;
		int playerAttack = 3;
		int enemyAttack = 3;
		Scanner inputStream = new Scanner(System.in);
		String playerName;
		String userInput;
		String battleOptions = "(1) Attack (2) Defend";
		boolean readyToBattle;
		System.out.println("Hello! Welcome to the example text based adventure game!\nWhat is your name?");
		playerName = inputStream.nextLine();
		System.out.println("Are you ready to battle your foe, " + playerName + "? Y/N");
		userInput = inputStream.next();
		if(userInput.equals("Y")) {
			readyToBattle = true;
			System.out.println("Alright, lets get ready to RUUUUUUMMMMBLE!");
		} else {
			readyToBattle = false;
			System.out.println("Whelp, see you again!");
		}
		while(readyToBattle && (playerHealth > 0 && enemyHealth > 0)) {
			int enemyDamageForTurn = enemyAttack;
			int playerDamageForTurn = playerAttack;
			System.out.println("HP: " + playerHealth + "/10");
			System.out.println("Enemy HP: " + enemyHealth + "/7");
			System.out.println(battleOptions);
			userInput = inputStream.next();
			if(userInput.equals("1")) {
				System.out.println("You attack! You deal " + playerAttack + " dammage!");
			} else {
				System.out.println("You defend! Your opponent only deals two thirds of their damage!");
				enemyDamageForTurn = 2;
				playerDamageForTurn = 0;
			}
			enemyHealth -= playerDamageForTurn;
			// System.out.println("You deal " + playerDamageForTurn + " damage!")
			playerHealth -= enemyDamageForTurn;
			System.out.println("Darn! Your enemy dealt " + enemyDamageForTurn + " damage!");
		}
		if(playerHealth > 0) {
			System.out.println("You Won!");
		} else {
			System.out.println("NO! YOU LOST!");
		}
		System.out.println("Thank you for playing a quick example of a text based adventure game in Java.\nCopyright Noah Connors 2017");
	}
}