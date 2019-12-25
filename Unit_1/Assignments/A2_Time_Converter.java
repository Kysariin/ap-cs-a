
// change the class name to Main

import java.util.Scanner;
import java.lang.Math;

public class A2_Time_Converter {
  
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    System.out.println("Seconds Since Unix Epoch: ");
    int unix = scan.nextInt();
    int sec = unix % 60;
    int secleft = unix / 60;
    int min = secleft % 60;
    int minleft = secleft / 60;
    int hour = minleft % 24;
    int hourleft = minleft / 24;
    int day = hourleft % 30;
    int dayleft = hourleft / 30;
    int month = dayleft % 12;
    int year = (hourleft / 360) + 1970;

    System.out.println("Year: " + year + "\nMonth: " + month + "\nDay: " + day + "\nHour: " + hour + "\nMin: " + min + "\nSec: " + sec);
  }
}
