import java.util.Scanner;

public class Lesson_12_Activity_Two {

	public static void main(String[] args) {
		// Input two decimal numbers and print the largest.
		// If the numbers are equal, print one of them.

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter two numbers: ");
		double val1 = scan.nextDouble();
		double val2 = scan.nextDouble();

		if (val1 > val2) {
			System.out.println("\nLargest is: " + val1);
		}
		else if (val2 > val2) {
			System.out.println("\nLargest is: " + val2);
		}
		else {
			System.out.println("\nLargest is: " + val1);
		}
	}

}
