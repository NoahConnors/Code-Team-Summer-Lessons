import java.util.Scanner;
import java.util.Random;

class ENLevel2Game {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Welcome to literally the trashiest game that exists on Earth!");
		Scanner inputTaker = new Scanner(System.in);
		String name;
		int age;
		Thread.sleep(500);
		System.out.println("Please enter your name.");
		name = inputTaker.nextLine();
		Thread.sleep(500);
		System.out.println("Oh, hello " + name + "!");
		Thread.sleep(250);
		System.out.println("Well, " + name + ", how old are you exactly?");
		age = inputTaker.nextInt();
		Thread.sleep(500);
		if(age < 13) {
			System.out.println("Well hello there little " + name + "!");
		} else if(age > 19) {
			System.out.println("What's up old man " + name + "!");
		} else {
			System.out.println("Yo, what is hangin' my fellow teen " + name + "!");
		}
		Thread.sleep(500);
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
		System.out.println("Very well, " + name + ". Your adventure begins now!");
		Thread.sleep(1000);
		System.out.println("A serial killer has appeared in your area.");
		Thread.sleep(500);
		double x = 50;
		double i = 50;
		while(x > 0 || i > 0) {
			String fight;
			System.out.println("Enter what you will do - attack or heal?");
			fight = inputTaker.next();
			if(fight.equals("Attack") || fight.equals("attack")) {
				System.out.println("You have decided to attack the serial killer!");
				x = x - (Math.random() * 9.9);
				i = i - (Math.random() * 10);
			} else if(fight.equals("Heal") || fight.equals("heal")) {
				System.out.println("You have decided to attempt to heal!");
				x = x + (Math.random() * 5);
				x = x - (Math.random() * 4.9);
			} if(x < 0) {
				System.out.println("You lost. You are a failure to your entire family. Game over!");
				break;
			} if(i < 0) {
				System.out.println("You have defeated the serial killer. You now can live for a good 10 more years!");
				Thread.sleep(1500);
				System.out.println("Congratulations on defeating the easiest game in existence, " + name + ". Game over!");
				break;
			}
			System.out.println("Your health is " + x + "!");
			System.out.println("The serial killer's health is " + i + "!");
		}
	}
}