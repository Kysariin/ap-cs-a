import java.util.Scanner;
public class Lesson_4_Activity_One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input 2 doubles and print them backwards on screen
		double num1;
		double num2;
		System.out.println("1st decimal:");
		num1 = scan.nextDouble();
		System.out.println("2nd decimal:");
		num2 = scan.nextDouble();

		System.out.println(num2 + " " + num1);

	}

}
