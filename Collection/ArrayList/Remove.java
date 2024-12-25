package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Remove {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();
          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);
          list.add(50);
          Iterator<Integer> iterator = list.iterator();
          while (iterator.hasNext()) {
               Integer number = iterator.next();
               if (number > 30) {
                    iterator.remove();
               }
          }
          System.out.println(list);
     }
}
