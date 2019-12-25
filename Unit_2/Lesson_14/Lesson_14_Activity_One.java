import java.util.Scanner;

public class Lesson_14_Activity_One {

	public static void main(String[] args) {
		// Test if an integer is not between 5 and 76 inclusive.

		Scanner scan = new Scanner (System.in);

		System.out.println("Enter a number:");
		int val = scan.nextInt();

		if(val >= 5 && val <= 76) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}

	}

}
