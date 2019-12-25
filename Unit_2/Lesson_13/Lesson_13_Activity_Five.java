import java.util.Scanner;
import java.lang.Math;

public class Lesson_13_Activity_Five {

	public static void main(String[] args) {
		// Create a program to let the user practice their
		// multiplication tables. Print two random integers
		// between 1 and 12 each on a new line. Then, ask the
		// user to input the multiplication of the two numbers.
		// If they enter the correct product print “Correct!”
		// otherwise print “Wrong”.

		Scanner scan = new Scanner (System.in);
		int num1 = (int)(Math.random() * 12) + 1;
		int num2 = (int)(Math.random() * 12) + 1;

		System.out.println(num1 + "\n" + num2 + "\nWhat is the product"
				+ " of these two numbers?");

		int pro = scan.nextInt();

		if(pro == (num1 * num2)) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Wrong");
		}

	}

}
