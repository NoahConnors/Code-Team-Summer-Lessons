import java.util.Scanner;

class ENLevel3Calculator {
	public static double add(double numberOne, double numberTwo) {
		return numberOne + numberTwo;	
	}
	public static double subtract(double numberOne, double numberTwo) {
		return numberOne - numberTwo;	
	}
	public static double multiply(double numberOne, double numberTwo) {
		return numberOne * numberTwo;	
	}
	public static double divide(double numberOne, double numberTwo) {
		return numberOne / numberTwo;	
	}
	public static void main(String args[]) throws InterruptedException {
		Scanner inputTaker = new Scanner(System.in);
		ENLevel3Calculator maths = new ENLevel3Calculator();
		boolean awfulCalculatorProgram = true;
		while(awfulCalculatorProgram) {
			String continueProgram;
			char operator;
			double operatorNumberOne, operatorNumberTwo;
			System.out.println("Please add, subtract, multiply, or divide two numbers below. (MUST BE SPACED - Ex: 2 + 2)");
			operatorNumberOne = inputTaker.nextDouble();
			operator = inputTaker.next().charAt(0);
			operatorNumberTwo = inputTaker.nextDouble();
			if(operator == '+') {
				double result = add(operatorNumberOne, operatorNumberTwo);
				System.out.println("The answer is " + result);
			} else if(operator == '-') {
				double result = subtract(operatorNumberOne, operatorNumberTwo);
				System.out.println("The answer is " + result);
			} else if(operator == '*') {
				double result = multiply(operatorNumberOne, operatorNumberTwo);
				System.out.println("The answer is " + result);
			} else if(operator == '/') {
				double result = divide(operatorNumberOne, operatorNumberTwo);
				System.out.println("The answer is " + result);
			} if(awfulCalculatorProgram) {
				System.out.println("Do you want to continue using the awful calculator?");
				continueProgram = inputTaker.next();
				if(continueProgram.equals("Yes") || continueProgram.equals("yes")) {
				System.out.println("Thank you for choosing to continue with this terrible program.");
				Thread.sleep(400);
				continue;
				} else if(continueProgram.equals("No") || continueProgram.equals("no")) {
				System.out.println("Thank you for using the calculator program.");
				awfulCalculatorProgram = false;
				}
			}
		}
	}
}