import java.util.Scanner;

public class Lesson_12_Activity_Three {

	public static void main(String[] args) {
		// Test if a number input from the keyboard is
		// a valid test score (between 0 and 100 inclusive).

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a test score: ");
		double val = scan.nextDouble();
		if (val >= 0 && val <= 100) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not Valid");
		}
	}

}
