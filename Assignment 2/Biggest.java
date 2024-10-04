import java.util.Scanner;

public class Biggest {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the three numbers");
          int firstNumber = sc.nextInt();
          int secondNumber = sc.nextInt();
          int thirdNumber = sc.nextInt();
          if (firstNumber > secondNumber && firstNumber > thirdNumber )
               System.out.println("The biggest number is : "+firstNumber);
          else if(secondNumber > thirdNumber)
               System.out.println("The biggest number is : "+secondNumber);
          else
               System.out.println("The biggest number is : "+thirdNumber);
          sc.close();
     }
     
}