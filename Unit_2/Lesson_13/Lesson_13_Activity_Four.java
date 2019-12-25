import java.util.Scanner;

public class Lesson_13_Activity_Four {

	public static void main(String[] args) {
		// Input an integer grade from the keyboard and translate
		// it to a letter grade. For example, if a user enters 4,
		// print "A", and if they enter 0 print "F." You can assume
		// that an integer between 0 and 4 will be input.

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a grade:");
		int val = scan.nextInt();

		if(val == 4) {
			System.out.println("A");
		}
		else if(val == 3) {
			System.out.println("B");
		}
		else if(val == 2) {
			System.out.println("C");
		}
		else if(val == 1) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
