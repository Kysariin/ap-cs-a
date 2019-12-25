import java.util.Scanner;

public class Lesson_13_Activity_Six {

	public static void main(String[] args) {
		// Write the code for the sensor that will be tracking the
		// temperature. If the temperature falls below 99 or above
		// 102 your code should print “WARNING” otherwise “Temperature
		// is OK”. The values 99 and 102 are considered to be included
		// in the ok range and the input will be in doubles.

		Scanner scan = new Scanner (System.in);

		System.out.println("What is the temperature?");
		double val = scan.nextDouble();

		if(val < 99 || val > 102) {
			System.out.println("WARNING");
		}
		else {
			System.out.println("Temperature is OK");
		}

}
} 
