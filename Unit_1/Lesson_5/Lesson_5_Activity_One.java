import java.util.Scanner;
public class Lesson_5_Activity_One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input 2 doubles and find the difference between them
		double num1;
		double num2;
		System.out.println("1st decimal:");
		num1 = scan.nextDouble();
		System.out.println("2nd decimal:");
		num2 = scan.nextDouble();

		double dif;
		dif = num1 - num2;

		System.out.println(dif);

	}

}
