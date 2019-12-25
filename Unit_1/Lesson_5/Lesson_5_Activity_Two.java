import java.util.Scanner;
public class Lesson_5_Activity_Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input 4 ints and print the sum

		int num1;
		int num2;
		int num3;
		int num4;

		System.out.println("1st integer:");
		num1 = scan.nextInt();
		System.out.println("2nd integer:");
		num2 = scan.nextInt();
		System.out.println("3rd integer:");
		num3 = scan.nextInt();
		System.out.println("4th integer:");
		num4 = scan.nextInt();

		int sum;
		sum = num1 + num2 + num3 + num4;
		System.out.println(sum);
	}

}
