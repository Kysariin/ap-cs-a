import java.util.Scanner;
import java.lang.Math;
public class Lesson_10_Activity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input 2 decimal values n subtract with no roundoff errors
		System.out.println("Please enter two decimal values:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		num1 = num1 * 1000;
		num2 = num2 * 1000;

		double num3 = num1 - num2;

	}

}
