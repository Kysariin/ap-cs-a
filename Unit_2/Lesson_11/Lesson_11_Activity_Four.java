import java.util.Scanner;

public class Lesson_11_Activity_Four {

	public static void main(String[] args) {
		// Test if an integer input from the keyboard is odd or even.

		System.out.println("Input an integer: ");
		Scanner scan = new Scanner (System.in);
		int val = scan.nextInt();

		if(val % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
