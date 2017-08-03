import java.util.Scanner;

class Yee {
	public static void main(String args[]) {
		System.out.println("Plz Enter a Whole #");
		Scanner sserInput = new Scanner(System.in);
		int userInput = sserInput.nextInt();	
		if(userInput < 22) {
			System.out.println("tooooo loooooowwwww");
		} else if(userInput == 22) {
			System.out.println("You're Right");
		} else {
			System.out.println("Tooooooo Highhhhhhhhhhh");
		}
	}
}