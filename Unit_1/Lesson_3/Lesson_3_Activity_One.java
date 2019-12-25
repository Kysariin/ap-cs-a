import java.util.Scanner;
public class Lesson_3_Activity_One {

	public static void main(String[] args) {
		// ask for name greet them
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Hi! What's your name?");
		name = scan.nextLine();
		System.out.println("Hi " + name + ", nice to see you.");

	}

}
