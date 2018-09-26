package Input;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		
		System.out.println("Enter name:");
		
		String name = inputScanner.nextLine();
		
		System.out.println("hello " + name);
		
		
        System.out.print("Enter your age (5<age<120: ");
        
        int age = inputScanner.nextInt();
        
        if (age > 120) {
        	 System.out.println(" You lying piece of shit!!!!");
        } else if(age <5 ) {
        	 System.out.println(" You must be older!");
        	 System.exit(0);
        } else {
        	 System .out.println("So your age is: " + age);
        }
		
        
      if (weight > 250) {  
         System.out.print("Enter your weight: ");
	} else if(weight <10 ) {
   	 System.out.println(" You must be skinny!");
   	 System.exit(0);
   } else {
        double weight = inputScanner.nextDouble();
		
        System .out.println("So your weight is: " + weight);
		
	}
}

}
