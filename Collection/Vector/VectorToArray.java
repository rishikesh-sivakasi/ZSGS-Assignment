package Vector;

import java.util.*;

public class VectorToArray {
     public static void main(String[] args) {
          Vector<String> vector = new Vector<>();
          Collections.addAll(vector, "red", "green", "blue", "yellow");
          String color[] = vector.toArray(new String[0]);
          System.out.println("Convert the vector to Array "+ Arrays.toString(color));
          Vector<String> vector2 = new Vector<>();
          Collections.addAll(vector2, color);
          System.out.println("Convert that array into another vector :"+ vector2);
     }
}
