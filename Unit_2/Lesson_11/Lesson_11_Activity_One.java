import java.util.Scanner;

public class Lesson_11_Activity_One {

	public static void main(String[] args) {
		// Test if an integer input from the keyboard is equal
		// to the integer 176. If it is, print "YES" (without
		// the quotes).

		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();

		if(val == 176) {
			System.out.println("YES");
		}


	}

}
