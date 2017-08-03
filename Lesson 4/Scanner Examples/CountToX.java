import java.util.Scanner;


class CountToX {
	public static void main(String args []) {
		System.out.println("Pick a number to count to!         (Try ten million.)");
		Scanner userInput = new Scanner(System.in);
		int userInpu = userInput.nextInt();
		for(int x = 0; x <= userInpu; x++) {
			if (x > 0) {
			System.out.println(x);		
			}
		}
		System.out.println("I counted to " + userInpu + "!");
	}
}		