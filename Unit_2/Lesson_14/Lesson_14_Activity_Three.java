import java.util.Scanner;

public class Lesson_14_Activity_Three {

	public static void main(String[] args) {
		// The Internet runs on web addresses. The addresses we type
		// represent the IP address for each site and how the computer
		// finds an individual web page. IP addresses are made up of four
		// numbers, each between 0 and 255 separated by a period. For
		// example, 128.253.21.58 is an IP address. Write a program to
		// enter four numbers and test if they make up a valid IP address.
		// In other words, test to see if the numbers entered are between
		// 0 and 255 inclusive.

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the first octet:");
		int oct1 = scan.nextInt();
		System.out.println("Please enter the second octet:");
		int oct2 = scan.nextInt();
		System.out.println("Please enter the third octet:");
		int oct3 = scan.nextInt();
		System.out.println("Please enter the fourth octet:");
		int oct4 = scan.nextInt();

		if(oct1 < 0 || oct1 > 255) System.out.println("Octet 1 is incorrect");
		if(oct2 < 0 || oct2 > 255) System.out.println("Octet 2 is incorrect");
		if(oct3 < 0 || oct3 > 255) System.out.println("Octet 3 is incorrect");
		if(oct4 < 0 || oct4 > 255) System.out.println("Octet 4 is incorrect");

		if((oct1 >= 0 && oct1 <= 255) && (oct2 >= 0 && oct2 <= 255) &&
				(oct3 >= 0 && oct3 <= 255) && (oct4 >= 0 && oct4 <= 255)) {
			System.out.println("IP Address: " + oct1 + "." + oct2 + "." + oct3 + "." + oct4);
		}
	}

}
