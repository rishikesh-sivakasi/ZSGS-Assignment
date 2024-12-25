package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter your phone number: ");
            String phoneNumber = sc.next();
            
            String regex = "\\+?[0-9]{10,13}";
            
            if (phoneNumber.matches(regex)) {
                System.out.println("Your phone number is: " + phoneNumber);
            } else {
                System.out.println("Invalid phone number. Enter a valid 10-13 digit number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter only numbers for the phone number.");
        } finally {
            sc.close();
        }
    }
}
