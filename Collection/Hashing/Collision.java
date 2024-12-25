package Hashing;

import java.util.HashMap;

public class Collision {
     public static void main(String[] args) {

        HashMap<String, String> studentGrades = new HashMap<>();

        studentGrades.put("Arun", "A");
        studentGrades.put("Bala", "B");
        studentGrades.put("Ravi", "C");
        studentGrades.put("Arun", "A+"); 
        studentGrades.put("Sam", "B+");

        System.out.println("HashMap Contents:");
        for (String student : studentGrades.keySet()) {
            System.out.println("Student: " + student + ", Grade: " + studentGrades.get(student));
        }

        System.out.println("When adding a duplicate key 'Arun'   , the old value is replaced with the new one.");
    }
}
