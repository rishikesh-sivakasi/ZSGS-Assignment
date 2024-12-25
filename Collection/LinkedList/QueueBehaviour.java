package LinkedList;

import java.util.*;

public class QueueBehaviour {
     public static void main(String[] args) {
          Queue<String> list = new LinkedList<>();
          list.add("Alice");
          list.add("Bob");
          list.add("Charlie");
          list.add("Diana");
          System.out.println("Before remove the elements : "+list);
          list.poll();
          list.poll();
          System.out.println("After remove the elements : "+list);
     }
}
