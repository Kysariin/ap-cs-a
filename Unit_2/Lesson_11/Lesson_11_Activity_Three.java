import java.util.Scanner;

public class Lesson_11_Activity_Three {

	public static void main(String[] args) {
		// Get two integers from the keyboard and test
		// if they are equal. If they are, print "YES"
		// (without the quotes).

		System.out.println("Enter two integers: ");
		Scanner scan = new Scanner (System.in);
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();

		if (val1 == val2) {
			System.out.println("YES");
		}
	}

}
