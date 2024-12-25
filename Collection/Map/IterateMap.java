package Map;

import java.util.*;

public class IterateMap {
     public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("cherry", 7);
        map.put("date", 3);

        System.out.println("Treemap entries:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
     }
}
