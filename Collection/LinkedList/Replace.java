package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Replace {
     public static void main(String[] args) {
          LinkedList<String> list = new LinkedList<>();
          list.add("one");
          list.add("two");
          list.add("three");
          list.add("four");
          list.add("five");
          System.out.println("Before the replace : "+list);
          ListIterator<String> i = list.listIterator();
          while (i.hasNext()) {
               String temp = i.next();
               if (temp.equals("three")) {
                    i.set("THREE");
               }
          }
          System.out.println("After the replace :"+list);
     }
}
