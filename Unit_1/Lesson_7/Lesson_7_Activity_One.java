import java.util.Scanner;
public class Lesson_7_Activity_One {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input a positive 3 digit int. print out the digits 1 per line
		System.out.println("Please enter a 3 digit number:");
		int num = scan.nextInt();
		int num1 = num / 100;
		int num2 = (num / 10) - (num1 * 10);
		int num3 = num - (num1 * 100) - (num2 * 10);
		System.out.println(num1 + "\n" + num2 + "\n" + num3);
	}

}
