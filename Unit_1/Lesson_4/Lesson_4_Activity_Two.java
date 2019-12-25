import java.util.Scanner;
public class Lesson_4_Activity_Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ask for user's name and age and print how many years until they're 100
		String name;
		int age;
		System.out.println("What's your name?");
		name = scan.nextLine();
		System.out.println("How old are you?");
		age = scan.nextInt();
		int time;
		time = 100 - age;

		System.out.println(name + ", you will be 100 in " + time + " years.");

	}

}
