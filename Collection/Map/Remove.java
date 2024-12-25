package Map;

import java.util.HashMap;

public class Remove {
     public static void main(String[] args) {
          HashMap<String, Integer> studentGrades = new HashMap<>();
          studentGrades.put("John", 85);
          studentGrades.put("Jane", 92);
          studentGrades.put("Tom", 76);
          studentGrades.put("Lucy", 89);
          System.out.println("Original map ");
          System.out.println(studentGrades);
          if (studentGrades.containsKey("Tom")) {
               studentGrades.remove("Tom");
               System.out.println("'Tom' was founded and removed from the map.");
          } else {
               System.out.println("'Tom' is not in the map.");
          }

          System.out.println("Updated student grades:");
          for (String name : studentGrades.keySet()) {
               System.out.println("Student: " + name + ", Grade: " + studentGrades.get(name));
          }
     }
}
