import java.util.Scanner;
import java.util.Random;

class ENLevel2Game {
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
		double serialkillerHealth = 50;
		System.out.println("A serial killer appears in front of you!");
		Thread.sleep(400);
		while(fightOne) {
			String fight;
			System.out.println("Enter what you will do - attack, heal, or run?");
			fight = inputTaker.next();
			if(fight.equals("Attack") || fight.equals("attack")) {
				System.out.println("You have decided to attack the serial killer!");
				playersHealth = playersHealth - (Math.random() * 19.9);
				serialkillerHealth = serialkillerHealth - (Math.random() * 20.4);
				playersHealth = (Math.round(playersHealth));
				serialkillerHealth = (Math.round(serialkillerHealth));
			} if(fight.equals("Heal") || fight.equals("heal")) {
				System.out.println("You have decided to attempt to heal!");
				playersHealth = playersHealth + (Math.random() * 10.4);
				playersHealth = playersHealth - (Math.random() * 9.9);
				playersHealth = (Math.round(playersHealth));
				serialkillerHealth = (Math.round(serialkillerHealth));
			} if(fight.equals("Run") || fight.equals("run")) {
				System.out.println("You have attempted to run!");
				} if(new java.util.Random().nextInt(20)==0) {
					System.out.println("You have successfully escaped.");
					fightOne = false;
					Thread.sleep(400);
				} else if(fight.equals("Run") || fight.equals("run")) { 
					System.out.println("Your escape attempt has failed.");
					playersHealth = playersHealth - (Math.random() * 9.9);
					playersHealth = (Math.round(playersHealth));
					Thread.sleep(400);
			} if(playersHealth < 0) {
				System.out.println("You lost. You are a failure to your entire family. Try again!");
				Thread.sleep(400);
				playersHealth = 50;
				serialkillerHealth = 50;
				System.out.println("A serial killer appears in front of you!");
				Thread.sleep(800);
				continue;
			} if(serialkillerHealth < 0) {
				System.out.println("You have defeated the serial killer. You now can live for a good 10 more years!");
				Thread.sleep(400);
				System.out.println("Congratulations on defeating the serial killer, " + name + "!");
				fightOne = false;
			} if(playersHealth > 0) {
				Thread.sleep(400);
				System.out.println("Your health is " + playersHealth + "/50!");
				System.out.println("The serial killer's health is " + serialkillerHealth + "/50!");
				Thread.sleep(400);
			}
		}
		Thread.sleep(400);
		System.out.println("You have defeated the game, " + name + "!");
	}
}