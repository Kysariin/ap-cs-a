import java.util.Scanner;

public class Lesson_12_Activity_One {

	public static void main(String[] args) {
		// Write a program to input three integers. Test if the average
		// is greater than or equal to 89.5. If so, print out the
		// phrase "ABOVE AVERAGE" (without the quotes).

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter three integers: ");
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		int val3 = scan.nextInt();

		double avg = val1 + val2 + val3;
		avg = (double)avg / 3;

		if (avg >= 89.5) {
			System.out.println("ABOVE AVERAGE");
		}
	}

}
