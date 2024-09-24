import java.util.Scanner;

enum Days{
     MONDAY,
     TUESDAY,
     WEDNESDAY,
     THUSDAY,
     FRIDAY
}

public class Weekdays {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number from 1 to 5");
          int day = sc.nextInt();
          switch (day) {
               case 1:
                    System.out.println(Days.MONDAY);
                    break;
               case 2:
                    System.out.println(Days.TUESDAY);
                    break;
               case 3:
                    System.out.println(Days.WEDNESDAY);
                    break;
               case 4:
                    System.out.println(Days.THUSDAY);
                    break;
               case 5:
                    System.out.println(Days.FRIDAY);
                    break;
               default:
               System.out.println("Invalid Number");
                    break;
          }
          sc.close();
     }
}
