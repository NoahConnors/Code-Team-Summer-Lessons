import java.util.Scanner;
import java.util.Random;

class ENLevel4Game {
	public static void main(String args[]) throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Welcome to literally the trashiest game that exists on Earth!");
		Scanner inputTaker = new Scanner(System.in);
		String name;
		int age;
		Thread.sleep(400);
		System.out.println("Please enter your name.");
		name = inputTaker.nextLine();
		Thread.sleep(400);
		System.out.println("Oh, hello " + name + "!");
		Thread.sleep(400);
		System.out.println("Well, " + name + ", how old are you exactly?");
		age = inputTaker.nextInt();
		Thread.sleep(400);
		if(age < 13) {
			System.out.println("Well hello there little " + name + "!");
		} else if(age > 19) {
			System.out.println("What's up old man " + name + "!");
		} else {
			System.out.println("Yo, what is hangin' my fellow teen " + name + "!");
		}
		Thread.sleep(400);
		System.out.println(name + ", are you ready to begin your adventure?");
		boolean startAdventure = true;
		String begin;
		while(startAdventure) {
			begin = inputTaker.next();
			if(begin.equals("Yes") || begin.equals("yes")|| begin.equals("YES")) {
				startAdventure = false;
			} else {
				System.out.println("SUBMIT TO THE AUTHORITY AND TYPE YES " + name + "!");
			}
		}
		Thread.sleep(400);
		System.out.println("Very well, " + name + ". Your adventure begins now!");
		Thread.sleep(400);
		boolean fightOne = true;
		double playersHealth = 50;
		double serialKillerHealth = 50;
		System.out.println("A serial killer appears in front of you!");
		Thread.sleep(400);
		while(fightOne) {
			String fight;
			System.out.println("Enter what you will do - attack, heal, or run?");
			fight = inputTaker.next();
			if(fight.equals("Attack") || fight.equals("attack")) {
				System.out.println("You have decided to attack the serial killer!");
				playersHealth = playersHealth - (Math.random() * 14.9);
				serialKillerHealth = serialKillerHealth - (Math.random() * 15.4);
				playersHealth = (Math.round(playersHealth));
				serialKillerHealth = (Math.round(serialKillerHealth));
			} if(fight.equals("Heal") || fight.equals("heal")) {
				System.out.println("You have decided to attempt to heal!");
				playersHealth = playersHealth + (Math.random() * 10.4);
				playersHealth = playersHealth - (Math.random() * 9.9);
				playersHealth = (Math.round(playersHealth));
				serialKillerHealth = (Math.round(serialKillerHealth));
			} if(fight.equals("Run") || fight.equals("run")) {
				System.out.println("You have attempted to run!");
				if(new java.util.Random().nextInt(20)==0) {
					System.out.println("You have successfully escaped.");
					fightOne = false;
					Thread.sleep(400);
				} else
					System.out.println("Your escape attempt has failed.");
					playersHealth = playersHealth - (Math.random() * 9.9);
					playersHealth = (Math.round(playersHealth));
					Thread.sleep(400);
			} if(fight.equals("EasterEgg")) {
				fightOne = false;
			} if(playersHealth <= 0) {
				System.out.println("You lost. You are a failure to your entire family. Try again!");
				Thread.sleep(600);
				playersHealth = 50;
				serialKillerHealth = 50;
				System.out.println("A serial killer appears in front of you!");
				Thread.sleep(400);
				continue;
			} if(serialKillerHealth <= 0) {
				System.out.println("You have defeated the serial killer!");
				Thread.sleep(400);
				if(playersHealth >= 10) {
					System.out.println("Congratulations, " + name + ", you have leveled up to level 2!");
					playersHealth = 53;
					fightOne = false;
				} else if(playersHealth < 10) 
					playersHealth = 50;
					fightOne = false;
			} if(playersHealth >= 0 && serialKillerHealth >= 0) {
				Thread.sleep(400);
				System.out.println("Your health is " + playersHealth + "/50!");
				System.out.println("The serial killer's health is " + serialKillerHealth + "/50!");
				Thread.sleep(400);
			}
		}
		Thread.sleep(400);
		if(playersHealth < 50) {
			playersHealth = 50;
		}
		System.out.println("That sure was dangerous, " + name + "!");
		Thread.sleep(400);
		System.out.println("Now it looks like you're safe. Where would you like to go?");
		Thread.sleep(400);
		System.out.println("Your options are Seattle, Los Angeles, Chicago, New Orleans, or New York City");
		Thread.sleep(400);
		boolean cityChoice = true;
		while(cityChoice) {
			String city;
			String cityConfirmation;
			city = inputTaker.nextLine();
			if(city.equals("New Orleans") || city.equals("Seattle") || city.equals("Los Angeles") || city.equals("Chicago") || city.equals("New York City")) {
				System.out.println("Are you sure you want to go to " + city + "?");
				cityConfirmation = inputTaker.next();
				if(cityConfirmation.equals("yes") || cityConfirmation.equals("Yes")) {
					Thread.sleep(400);
					System.out.println("Okay, " + name + ", I will prepare your tickets for " + city + ".");
					if(age <= 18) {
						Thread.sleep(400);
						System.out.println("Sorry, but you are underage to live by yourself. You will have to go to Chicago and live with a designated family.");
						break;
					} else
						Thread.sleep(400);
						System.out.println("Here are your tickets. Have fun!");
						Thread.sleep(400);
						System.out.println("Thank you for playing the game. Enjoy " + city + "!");
						System.exit(0);
				} else if(cityConfirmation.equals("no") || cityConfirmation.equals("No"))
					System.out.println("Well where do you want to go then?");
					continue;	
			}
		}
		Thread.sleep(400);
		System.out.println("But first, you must correctly answer a small quiz on this program.");
		int questionOne, questionTwo, questionThree, questionFour;
		boolean firstQuestion = true;
		Thread.sleep(400);
		System.out.println("Question 1 - On a scale of 1-10 how good is this game?");
		while(firstQuestion) {
		questionOne = inputTaker.nextInt();
			if(questionOne == 1) {
				Thread.sleep(400);
				System.out.println("Correct! Next question.");
				break;
			} else {
				Thread.sleep(400);
				System.out.println("Wrong. Try again.");
				continue;
			}
		}
		boolean secondQuestion = true;
		Thread.sleep(400);
		System.out.println("Question 2 - On a scale of 1-10 how much did this game make sense?");
		while(secondQuestion) {
		questionTwo = inputTaker.nextInt();
			if(questionTwo == 1) {
				Thread.sleep(400);
				System.out.println("Correct! Next question.");
				break;
			} else {
				Thread.sleep(400);
				System.out.println("Wrong. Try again.");
				continue;
			}
		}	
		boolean thirdQuestion = true;
		Thread.sleep(400);
		System.out.println("Question 3 - What number is contained in this random number generator from 0-10?");
		int answerThree = (int)(Math.random() * 10);
		while(thirdQuestion) {
		questionThree = inputTaker.nextInt();
			if(answerThree == questionThree) {
				Thread.sleep(400);
				System.out.println("Correct! Next question.");
				break;
			} else {
				Thread.sleep(400);
				System.out.println("Wrong. Try again.");
				continue;
			}
		}
		boolean fourthQuestion = true;
		Thread.sleep(400);
		System.out.println("What was the age that you put in earlier in the program?");
		while(fourthQuestion) {
		questionFour = inputTaker.nextInt();
			if(questionFour == age) {
				Thread.sleep(400);
				System.out.println("Correct! Next question.");
				break;
			} else {
				Thread.sleep(400);
				System.out.println("Wrong. Try again.");
				continue;
			}
		}
		boolean fifthQuestion = true;
		Thread.sleep(400);
		System.out.println("Question 5 - What is the developer's name?");
		String questionFive;
		while(fifthQuestion) {
		questionFive = inputTaker.next();
			if(questionFive.equals("Erik")) {
				Thread.sleep(400);
				System.out.println("Correct! You have completed the quiz!");
				break;
			} else {
				Thread.sleep(400);
				System.out.println("Wrong. Try again.");
				continue;
			}
		}
		Thread.sleep(400);
		System.out.println("Now, for the final test, you must defeat the ultimate death machine.");
		Thread.sleep(1000);
		double deathMachineHealth = 10000;
		System.out.println("It is me. I am the death machine. You hold no chance against the system.");
		Thread.sleep(800);
		boolean fightTwo = true;
		while(fightTwo) {
			String secondFight;
			if(playersHealth < 0) {
				playersHealth = 0;
				System.out.println("Prepare to die again!!!! There is no escape!!!!");
			}
			System.out.println("Enter what you will do - attack, heal, or run?");
			secondFight = inputTaker.next();
			if(secondFight.equals("Attack") || secondFight.equals("attack")) {
				System.out.println("You have decided to attack the serial killer!");
				playersHealth = playersHealth - (int)(Math.random() * 1000000);
				deathMachineHealth = deathMachineHealth + (int)(Math.random() * 1000000);
			} if(secondFight.equals("Heal") || secondFight.equals("heal")) {
				System.out.println("You have decided to attempt to heal!");
				Thread.sleep(800);
				System.out.println("But that doesn't work here.");
				playersHealth = playersHealth - (int)(Math.random() * 1000000);
			} if(secondFight.equals("Run") || secondFight.equals("run")) {
				System.out.println("You have attempted to run!");
				if(new java.util.Random().nextInt(10)==1) {
					System.out.println("NO!!!!!! YOU HAVE FOUND THE HOLE! The prograEnCt2b1731cc9884cf3d1b7d8d0179e8107853c32c968b1731cc9884cf3d1b7d8d017ZtZTqIV2oAMGyB1en1m9PS9NgXSjRMYWBQ==IwEmS");
					Thread.sleep(600);
					System.out.println("Game over. Victory has been achieved. System destroyed.");	
					System.exit(0);
				} else
					System.out.println("Your futile escape method has failed.");
					playersHealth = playersHealth - (int)(Math.random() * 1000000);
					Thread.sleep(800);
			} if(playersHealth < 0) {
				Thread.sleep(400);
				System.out.println("You have died!");
			} if(playersHealth <= 0 && deathMachineHealth >= 0) {
				Thread.sleep(800);
				System.out.println("Your health is " + playersHealth + "/50!");
				System.out.println("My health is " + deathMachineHealth + "/50!");
				Thread.sleep(800);
			}
		}
	}
}