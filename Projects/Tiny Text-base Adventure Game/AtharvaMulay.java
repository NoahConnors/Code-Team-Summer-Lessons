import java.util.Scanner;

class AtharvaMulay {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		String playerName;
		System.out.println("What's your name?");
		playerName = userInput.nextLine();
		System.out.println("'Sup, " + playerName + " and welcome to you're adventure!");
		int playerHealth = 25;
		int enemyHealth = 10000;
		int playerAttack = 4999;
		int enemyAttack = 13;
		String playerChoose;		
		System.out.println("Would you like to battle");
		playerChoose = userInput.nextLine();
		if(playerChoose.equals("No")) {
			System.out.println("Game Over");
		} else {
			while(playerHealth > 0 && enemyHealth > 0) {
				System.out.println("You''ll probably lose");
				System.out.println("Attack, Run, or Defend");
				playerChoose = userInput.nextLine();
				if(playerChoose.equals("Attack")) {
					enemyHealth = enemyHealth - playerAttack;
					System.out.println("Enemy HP:" + enemyHealth + "/10000");
				} else if(playerChoose.equals("Defend")) {
					System.out.println("You just lost a Turn");
					System.out.println("Hahahahahaha");
				} else {
					System.out.println("Hahahaha, You Can't");
				} 
				playerHealth = playerHealth - enemyAttack;
				System.out.println("hahahahahaha Your HP:" + playerHealth + "/25");
			}
			System.out.println("Haha You lost this troll game by Atharva");
		}
	}
}	
