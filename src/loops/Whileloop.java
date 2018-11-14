package loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(" Enter a number: ");
			double number1 = scanner.nextDouble();
			System.out.println("Enter a number: ");
			double number2 = scanner.nextDouble();
			
			System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
			System.out.println();
			
			if(number1 == 1 && number2 == 0);
			break;
			
		}

		
	}

}
