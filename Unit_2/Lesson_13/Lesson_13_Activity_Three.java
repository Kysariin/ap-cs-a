import java.util.Scanner;

public class Lesson_13_Activity_Three {

	public static void main(String[] args) {
		// Input two integers and print the largest integer (print
		// just the number, no text). If they are equal, print only
		// the word "EQUAL". You should be able to do this with only
		// one if statement but you may use multiple else statements.

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two integers: ");
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();

		if(val1 > val2) {
			System.out.println(val1);
		}
		else if(val2 > val1) {
			System.out.println(val2);
		}
		else {
			System.out.println("EQUAL");
		}

	}

}
