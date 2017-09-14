import java.util.Scanner;

class atharvamulay {
	public static int addStuff(int pi, int pi2) {
		int result = pi + pi2;
		return result;
	}
	public static int subStuff(int ti, int ti2) {
		int result = ti - ti2;
		return result;
	}
	public static void main(String args[]) throws InterruptedException{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello, What's your name?");
		String userName = userInput.nextLine();
		Thread.sleep(1500);
		int playerHealth = 24;
		int enemyHealth = 28;
		int Yee = 5;
		int Gub = 10;
		int Mamo = 7;
		int enemyAttack = 5;
		System.out.println("Hello, " + userName);
		Thread.sleep(1500);
		String playerChoose;
		System.out.println("Would you like to go into battle");
		playerChoose = userInput.nextLine();
		if(playerChoose.equals("No")) {
			System.out.println("Game Over");
		} else {
			while(playerHealth > 0 && enemyHealth > 0) { // it is good now
				System.out.println("Use Yee or Mamo");
				playerChoose = userInput.nextLine();
				if(playerChoose.equals("Yee")) {
					System.out.print(subStuff(enemyHealth, Yee));
					System.out.println("/28 is enemy's health");
					enemyHealth = enemyHealth - Yee;
				} else {
					System.out.print(subStuff(enemyHealth, Mamo));
					System.out.println("/28 is enemy's health");
					enemyHealth = enemyHealth - Mamo;
				}				
				Thread.sleep(1500);
				System.out.print(subStuff(playerHealth,enemyAttack));
				System.out.println("/24 is your health");
				playerHealth = playerHealth - enemyAttack;				
			}
			if(playerHealth < 0) {
				System.out.println("GAME OVER");
			} else {
				playerHealth = 35;
				enemyHealth = 40;
				Yee = 6; 
				Mamo = 8; 
				enemyAttack = 6;
				System.out.println("Your health is now 35/35 and Yee does 6 damage while Mamo does 8 damage");
				Thread.sleep(1500);
				System.out.println("Would you like to enter battle");
				playerChoose = userInput.nextLine();
				if(playerChoose.equals("No")) {
					System.out.println("Game Over");
				} else {
					while(playerHealth > 0 && enemyHealth > 0) { // it is good now
						System.out.println("Use Yee or Mamo");
						playerChoose = userInput.nextLine();
						if(playerChoose.equals("Yee")) {
							System.out.print(subStuff(enemyHealth, Yee));
							System.out.println("/40 is enemy's health");
							enemyHealth = enemyHealth - Yee;
						} else {
							System.out.print(subStuff(enemyHealth, Mamo));
							System.out.println("/40 is enemy's health");
							enemyHealth = enemyHealth - Mamo;
						}
						Thread.sleep(1500);
						System.out.print(subStuff(playerHealth,enemyAttack));
						System.out.println("/35 is your health");
						playerHealth = playerHealth - enemyAttack;
					}
					if(playerHealth < 0) {
						System.out.println("GAME OVER");
					} else {
						System.out.println("New move added called Gub and does 10 damage");
						playerHealth = 40;
						enemyHealth = 45;
						enemyAttack = 7;
						System.out.println("Would you like to go into battle");						
						playerChoose = userInput.nextLine();
						if(playerChoose.equals("No")) {
							System.out.println("Game Over");
						} else {
							while(playerHealth > 0 && enemyHealth > 0) { // it is good now
								System.out.println("Use Yee, Gub, or Mamo");
								playerChoose = userInput.nextLine();
								if(playerChoose.equals("Yee")) {
									System.out.print(subStuff(enemyHealth, Yee));
									System.out.println("/45 is enemy's health");
									enemyHealth = enemyHealth - Yee;
								} else if(playerChoose.equals("Gub")) {
									System.out.print(subStuff(enemyHealth, Gub));
									System.out.println("/45 is enemy's health");
									enemyHealth = enemyHealth - Gub;
								} else {
									System.out.print(subStuff(enemyHealth, Mamo));
									System.out.println("/45 is enemy's health");
									enemyHealth = enemyHealth - Mamo;
								}
								Thread.sleep(1500);
								System.out.print(subStuff(playerHealth,enemyAttack));
								System.out.println("/40 is your health");
								playerHealth = playerHealth - enemyAttack;
							}
							if(playerHealth < 0) {
								System.out.println("GAME OVER");
							} else {
								System.out.println("You've won");							
							}			
						}
					}
				}	
			}
		}
	}				
}			
	
		
