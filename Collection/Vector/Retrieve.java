package Vector;

import java.util.*;

public class Retrieve {
     public static void main(String[] args) {
          Vector<Integer> vector = new Vector<>();
          Scanner sc = new Scanner(System.in);
          Collections.addAll(vector, 10,20,30,40,50);
          System.out.println(vector);
          System.out.print("Enter the index to retrieve that value :");
          int temp = sc.nextInt();
          System.out.println("The value of the index is : "+vector.get(temp));
          sc.close();
     }
}
