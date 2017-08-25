import java.util.Scanner;

class atharvamulay {
	public static int addStuff(int pi, int pi2) {
		int result = pi + pi2;
		return result;		
	}
	public static int subStuff(int hi, int hi2) {
		int result = hi - hi2; 
		return result;
	}
	public static int mulStuff(int wi, int wi2) {
		int result = wi * wi2;
		return result;
	}
	public static int divStuff(int gi, int gi2) {
		int result = gi / gi2;
		return result;
	}
	public static void main(String args[]) throws InterruptedException{
		System.out.println("Hello your playing a game");
		Scanner userInput = new Scanner(System.in);
		Thread.sleep(1500);
		System.out.println("please enter your name");		
		String userName = userInput.nextLine();
		System.out.println("Hello, " + userName);
		System.out.println("You can use the basic functions such as + - * /");
		Thread.sleep(1500);
		System.out.println("Please enter a number");
		int userNumber = userInput.nextInt();
		System.out.println("Please enter another number");
		int userNumber2 = userInput.nextInt();
		System.out.println("Do you want to add, subtact, multiply, or divide these numbers");
		Thread.sleep(1500);
		System.out.println("Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
		int userYee = userInput.nextInt();
		if(userYee == 1) {			
			System.out.println(addStuff(userNumber, userNumber2));
		} else if(userYee == 2) {
			System.out.println(subStuff(userNumber, userNumber2));
		} else if(userYee == 3) {
			System.out.println(mulStuff(userNumber, userNumber2));
		} else if(userYee == 4) {
			System.out.println(divStuff(userNumber, userNumber2));
		} else {
			System.out.println("ERROR");
		}
	System.out.println("Plz use again for another problem");
	}
}