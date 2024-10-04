import java.util.Scanner;

public class Grade {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the student mark");
          int mark = sc.nextInt();
          if (mark>90 && mark<=100)
               System.out.println("A Grade");
          else if (mark>80 && mark<=90)
               System.out.println("B Grade");
          else if (mark>70 && mark<=80)
               System.out.println("C Grade");
          else if (mark>60 && mark<=70)
               System.out.println("D Grade");
          else if (mark>50 && mark<=60)
               System.out.println("E Grade");
          else if (mark>40 && mark<=50)
               System.out.println("F Grade");
          else 
               System.out.println("Sorry this sutudent is fail");
          sc.close();
     }
}
