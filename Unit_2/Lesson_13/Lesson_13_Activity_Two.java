import java.util.Scanner;

public class Lesson_13_Activity_Two {

	public static void main(String[] args) {
		// Take input of an integer number from the keyboard and print "passing"
		// if it's greater than or equal to 60, and print "failing" otherwise.

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer:");
		int val = scan.nextInt();

		if(val >= 60) {
			System.out.println("passing");
		}
		else {
			System.out.println("failing");
		}
	}

}
