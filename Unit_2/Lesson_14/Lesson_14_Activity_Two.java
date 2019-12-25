import java.util.Scanner;

public class Lesson_14_Activity_Two {

	public static void main(String[] args) {
		// Write a program to input two integers and print "Both
		// are positive or zero." to the screen, if both are positive
		// or zero. Print "One or both are negative." otherwise.
		Scanner scan = new Scanner (System.in);

		System.out.println("Input two integers:");
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();

		if(val1 >= 0 && val2 >= 0) {
			System.out.println("Both are positive or zero.");
		}
		else {
			System.out.println("One or both are negative.");
		}
	}

}
