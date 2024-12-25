package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Enum {
     public static void main(String[] args) {
         Vector<String> fruits = new Vector<>();
         fruits.add("apple");
         fruits.add("banana");
         fruits.add("cherry");
         fruits.add("date");
         fruits.add("fig");

         System.out.println("Original Vector:");
         Enumeration<String> enumeration = fruits.elements();
         while (enumeration.hasMoreElements()) {
              System.out.println(enumeration.nextElement());
         }

         int index = fruits.indexOf("cherry");
         if (index != -1) {
              fruits.set(index, "coconut");
         }

         System.out.println("\nModified Vector:");
         for (String fruit : fruits) {
              System.out.println(fruit);
         }
     }
}
