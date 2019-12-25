import java.util.Scanner;
public class Lesson_3_Activity_Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ask the user for an adjective and a name
		String name;
		String adj;
		System.out.println("Hey there. What's your name?");
		name = scan.nextLine();
		System.out.println("Cool. What's an adjective that describes you?");
		adj = scan.nextLine();
		System.out.println("My name is " + name + ". I am " + adj + ".");

	}

}
