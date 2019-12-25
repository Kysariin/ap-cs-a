import java.util.Scanner;

class Lesson_13_Activity_One {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);


    System.out.println("Please enter an integer: ");

      double val = scan.nextDouble();

      if (val > 0)
      System.out.println("Positive");

      if (val < 0)
        System.out.println("Negative");

      else
      System.out.println("Positive");


    }
}
