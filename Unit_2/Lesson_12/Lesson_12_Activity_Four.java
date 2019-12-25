import java.util.Scanner;

public class Lesson_12_Activity_Four {

	public static void main(String[] args) {
		// Write the code for the sensor that will be tracking
		// the temperature. If the temperature falls below 99 or
		// above 102 your code should print “WARNING”. The input
		// should be in doubles.

		Scanner scan = new Scanner (System.in);
		System.out.println("What is the temperature?");
		double val = scan.nextDouble();

		if(val < 99 || val > 102) {
			System.out.println("WARNING");
		}
	}

}
