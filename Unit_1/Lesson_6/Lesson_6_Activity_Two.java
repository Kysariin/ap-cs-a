import java.util.Scanner;
public class Lesson_6_Activity_Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input a double value and print only the integer part
		System.out.println("Input a double");
		double num = scan.nextDouble();
		num = (int)num;
		System.out.println(num);


	}

}
