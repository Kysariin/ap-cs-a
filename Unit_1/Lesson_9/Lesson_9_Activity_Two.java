import java.util.Scanner;
import java.lang.Math;
public class Lesson_9_Activity_Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// write the code to print a random int from -20 to 20 inclusive
		int num = (int)(Math.random() * 41) +  (-20);
		System.out.println(num);

	}

}
