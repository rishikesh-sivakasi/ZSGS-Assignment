package LinkedList;

import java.util.LinkedList;

public class Retrieve {
     public static void main(String[] args) {
          LinkedList<Integer> list = new LinkedList<>();
          list.add(5);
          list.add(10);
          list.add(15);
          list.add(20);
          list.add(25);
          System.out.println("The first element of the linked list is : "+list.getFirst());
          System.out.println("The last element of the linked list is : "+list.getLast());
     }
}
