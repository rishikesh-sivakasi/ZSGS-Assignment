package Map;

import java.util.*;

public class Frequency {
     public static void main(String[] args) {
          HashMap<Character,Integer> map = new HashMap<>();
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the string : ");
          String input = sc.next();
          for(char i : input.toCharArray()){
               map.put(i,map.getOrDefault(i,0)+1);
          }
          System.out.println("The frequency character of the string");
          for(Map.Entry<Character, Integer> entry : map.entrySet()){
               System.out.println(entry.getKey() +"->"+entry.getValue());
          }
          sc.close();
     }
}
