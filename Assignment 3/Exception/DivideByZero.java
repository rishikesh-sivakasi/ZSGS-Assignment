package Exception;

import java.util.Scanner;

public class DivideByZero {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first number: ");
          int firstNumber = sc.nextInt();
          System.out.print("Enter the second number: ");
          int secondNumber = sc.nextInt();
          try{
               System.out.println(firstNumber +" / "+ secondNumber +" = "+(firstNumber / secondNumber));
          }catch (ArithmeticException ae){
               System.out.println("Second number must be greater than 0");
          }finally{
               sc.close();
          }
     }
}
