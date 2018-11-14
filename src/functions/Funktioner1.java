
package functions;

import java.util.Scanner;

public class Funktioner1 {


  public static void main(String[] args) {
			smallestAmongThree(input());
			highestAmongThree(input());
		}
		public static int[] input() {
			Scanner scanner = new Scanner(System.in);
			int[] inputs = new int[3];
			System.out.print("Input the first number:");
			inputs[0] = scanner.nextInt();
			System.out.print("Input the Second number:");
			inputs[1] = scanner.nextInt();
			System.out.print("Input the third number:");
			inputs[2] = scanner.nextInt();
			return inputs;
		}
		
		private static void smallestAmongThree(int[] inputs) {
			int tempVar;
			if (inputs[0] < inputs[1]) {
				tempVar = inputs[0];
			} else {
				tempVar = inputs[1];
			}
			System.out.print("The smallest value is ");
			if (tempVar < inputs[2]) {
				System.out.println(tempVar);
			} else {
				System.out.println(inputs[2]);
			}
		}
		
		private static void highestAmongThree(int[] inputs) {
			int tempVar;
			if (inputs[0] > inputs[1]) {
				tempVar = inputs[0];
			} else {
				tempVar = inputs[1];
			}
			System.out.print("The highest value is ");
			if (tempVar > inputs[2]) {
				System.out.println(tempVar);
			} else {
				System.out.println(inputs[2]);

	}
		}
	}