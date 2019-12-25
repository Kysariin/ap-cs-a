
// you will have to change the class name (to Main i think) when submitting

import java.util.Scanner;
public class A1_Movie_Ratings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 3 website reviews (int), 2 focus group reviews (double), 1 critic review (double)
		 * avg of all separate. avg of all together (website = 20%, focus = 30%, critic = 50%)
		 */
		System.out.println("Please enter ratings from the movie review website.");
		int web1 = scan.nextInt();
		int web2 = scan.nextInt();
		int web3 = scan.nextInt();

		System.out.println("Please enter ratings from the focus group.");
		double focus1 = scan.nextDouble();
		double focus2 = scan.nextDouble();

		System.out.println("Please enter the average movie critic rating.");
		double critic = scan.nextDouble();

		double aweb = (web1 + web2 + web3);
		aweb = aweb / 3;
		System.out.println("Average website rating: " + aweb);

		double afocus = focus1 + focus2;
		afocus = afocus / 2;
		System.out.println("Average focus group rating: " + afocus);

		System.out.println("Average movie critic rating: " + critic);

		double average = (aweb * .2) + (afocus * .3) + (critic * .5);
		System.out.println("Overall movie rating: " + average);

	}

}
