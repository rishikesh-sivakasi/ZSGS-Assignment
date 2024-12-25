package LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<Character> list = new LinkedList<>();
        Collections.addAll(list, 'A', 'B', 'C', 'D', 'E');
        
        System.out.println("Original LinkedList: " + list);

        reverseLinkedList(list);

        System.out.println("Reversed LinkedList: " + list);
    }

    public static void reverseLinkedList(LinkedList<Character> list) {
        Collections.reverse(list);
    }
}
