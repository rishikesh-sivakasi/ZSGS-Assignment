package Map;

import java.util.*;

public class Merge {
     public static void merge(HashMap<Character,Integer> map,HashMap<Character,Integer> map2){
               for(Map.Entry<Character,Integer> entry : map2.entrySet()){
                    map.put(entry.getKey(), entry.getValue());
          }
     }
     public static void main(String[] args) {
          HashMap<Character,Integer> map = new HashMap<>();
          map.put('a',1);
          map.put('b',2);
          HashMap<Character,Integer> map2 = new HashMap<>(); 
          map2.put('b', 3);
          map2.put('c', 4);
          merge(map, map2);
          System.out.println(map);
     }
}
