package Exception;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
     InsufficientBalanceException(String s){
          super(s);
     }
}

public class BankOperation {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int amount = 10000;
          while (true) {
               System.out.println("Current balance : "+amount);
               System.out.println("1.Deposit");
               System.out.println("2.WithDraw");
               System.out.println("3.Check bank balance");
               System.out.println("4.Exit");
               int option = sc.nextInt();
               switch (option) {
                    case 1:
                         System.out.println("Enter the deposit amount:");
                         amount += sc.nextInt();
                         break;
                    case 2:
                         try{
                              System.out.print("Enter the withdraw amount:");
                              int withdrawAmount = sc.nextInt();
                              if(withdrawAmount > amount){
                                   throw new InsufficientBalanceException("Withdraw amount is more than balance.");
                              }else{
                                   amount -= withdrawAmount;
                              }
                         }catch (InsufficientBalanceException e){
                              System.out.println(e.getMessage());
                              System.exit(0);
                         }
                         break;
                    case 3:
                         System.out.println("Balance : "+amount);
                         break;
                    case 4:
                         System.exit(0);
                    default:
                         System.out.println("Enter the correct option");
                         break;
               }
          }
     }
}
