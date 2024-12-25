package Exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age to find out if you are eligible for voting or not: ");
        
        int age = sc.nextInt();
        try {
            if (age <= 0) {
                throw new InvalidAgeException("Age must be greater than 0");
            } else if (age < 18) {
                System.out.println("You are not eligible for voting");
            } else {
                System.out.println("You are eligible for voting");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
