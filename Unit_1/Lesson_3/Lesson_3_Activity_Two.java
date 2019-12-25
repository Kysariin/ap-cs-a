import java.util.Scanner;
public class Lesson_3_Activity_Two {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// write a program that asks the user for 3 names then prints in reverse
		String name1;
		String name2;
		String name3;
		System.out.println("1st name:");
		name1 = scan.nextLine();
		System.out.println("2nd name:");
		name2 = scan.nextLine();
		System.out.println("3rd name:");
		name3 = scan.nextLine();

		System.out.println(name3 + "\n" + name2 + "\n" + name1);

	}

}
