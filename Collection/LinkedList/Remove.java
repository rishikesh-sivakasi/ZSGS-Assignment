package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Remove {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

        int index = 0;
        ListIterator<Integer> i = list.listIterator();
        while (i.hasNext()) {
            i.next();
            if (index == 2) {
                i.remove();
            }
            index++;
        }

        list.removeLast();
        System.out.println(list);
    }
}
