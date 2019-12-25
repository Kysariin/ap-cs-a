import java.util.Scanner;

public class Lesson_11_Activity_Two {

	public static void main(String[] args) {
		// Test if a decimal value input from the keyboard
		// is equal to 48.729. If it is, print "YES" (without the quotes).

		System.out.println("Enter a decimal: ");
		Scanner scan = new Scanner (System.in);
		double val = scan.nextDouble();

		if (val == 48.729) {
			System.out.println("YES");
		}
	}

}
