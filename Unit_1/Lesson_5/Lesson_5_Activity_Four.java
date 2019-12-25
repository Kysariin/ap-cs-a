import java.util.Scanner;
public class Lesson_5_Activity_Four {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ask for price of item and calculate the change from $20
		double price;
		double change;
		System.out.println("How much is your item?");
		price = scan.nextDouble();

		change = 20 - price;

		System.out.println("Change from $20: $" + change);

	}

}
