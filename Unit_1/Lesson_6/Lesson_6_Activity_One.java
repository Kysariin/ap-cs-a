import java.util.Scanner;
public class Lesson_6_Activity_One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// find average between two integers that are inputed
		double num1;
		double num2;
		double avg;
		System.out.println("Please enter 2 integers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();

		avg = (num1 + num2) / 2;

		System.out.println("The average is: " + avg);
	}

}
