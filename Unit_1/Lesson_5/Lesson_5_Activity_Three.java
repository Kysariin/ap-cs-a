public class Lesson_5_Activity_Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// input the radius and print circumference and area
		// C = 2*pi*r
		// A = pi * r * r
		double radius;
		double circumference;
		double area;
		System.out.println("Radius:");
		radius = scan.nextDouble();

		circumference = 2 * 3.14 * radius;
		area = 3.14 * radius * radius;

		System.out.println("Circumference: " + circumference + "\nArea: " + area);

	}

}
