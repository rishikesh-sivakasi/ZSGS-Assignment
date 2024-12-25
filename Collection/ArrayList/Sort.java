package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();
          for(int i=0;i<10;i++){
               list.add((int) (Math.random() * 100) + 1);
          }
          System.out.println("List before sort : "+list);
          Collections.sort(list);
          System.out.println("List sorted in ascending order : "+list);
     }
}
