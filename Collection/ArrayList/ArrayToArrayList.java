package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
     public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          list.add("apple");
          list.add("banana");
          list.add("cherry");
          String[] fruits = list.toArray(new String[0]);
          for(String fruit: fruits){
               System.out.println(fruit);
          }
          List<String> list2 = new ArrayList<>(Arrays.asList(fruits));
          System.out.println(list2);
     }
}
