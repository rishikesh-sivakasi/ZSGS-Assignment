package Map;

import java.util.*;

public class Basic {
     public static void main(String[] args) {
          HashMap<String, Integer> map = new HashMap<>();
          map.put("Alice", 30);
          map.put("Bob", 25);
          map.put("Charlie", 35);
          map.put("Diana", 28);
          map.put("Edward", 40);

          if (map.containsKey("Charlie")) {
               System.out.println("The age of Charlie is: " + map.get("Charlie"));
          } else {
               System.out.println("Charlie is not in the map.");
          }
          System.out.println("\nAll entries in the HashMap:");
          for (String name : map.keySet()) {
               System.out.println("Name: " + name + ", Age: " + map.get(name));
          }
     }
}
