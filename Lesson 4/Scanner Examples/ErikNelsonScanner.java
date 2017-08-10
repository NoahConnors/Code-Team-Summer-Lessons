import java.util.Scanner;

class ErikNelsonScanner {
	public static void main(String args[]) {
		System.out.println("Try to guess the number!");
		Scanner inputTaker = new Scanner(System.in);
		int number;
		number = inputTaker.nextInt();
		if(number != 35937) {
			System.out.println("That is fake news.");
		} else {
			System.out.println("Good job cheating.");
		}
	}
}