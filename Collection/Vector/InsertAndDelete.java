package Vector;

import java.util.*;

public class InsertAndDelete {
     public static void main(String[] args) {
          Vector<Character> vector = new Vector<>();
          Collections.addAll(vector, 'A', 'B', 'C', 'D', 'E');
          System.out.println("Befor vector");
          System.out.println(vector);
          vector.add(2, 'X');
          vector.remove(0);
          System.out.println("After Vector");
          System.out.println(vector);
     }
}
