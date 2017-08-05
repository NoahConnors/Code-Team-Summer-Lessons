import java.util.Scanner;

class nupurkumar {
	public static void main(String args[]) {
		Scanner inputTaker = new Scanner(System.in);
		int input = inputTaker.nextInt();
		if(input < 80) {
			System.out.println("you typed a number less than 80");
		} else if(input == 80) {
			System.out.println("you typed the number 80");
			/* comment */
		} else { 
			System.out.println("you typed a number greator than 80");
		}
	}
}