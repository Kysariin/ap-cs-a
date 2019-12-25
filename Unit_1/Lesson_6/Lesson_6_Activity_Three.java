import java.util.Scanner;
public class Lesson_6_Activity_Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input a double & print the first 2 digits after decimal
		System.out.println("Please input a decimal number:");
		double num = scan.nextDouble();
		int num1 = (int)num * 100;
		num = num * 100;
		num = num - num1;
		System.out.println((int)num);


	}

}
