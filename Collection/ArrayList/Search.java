package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          List<Character> characters = new ArrayList<>();
          System.out.println("enter the 10 distinct characters");
          for(int i=0; i<10; i++){
               characters.add(sc.next().charAt(0));
          }
          System.out.print("Enter the character to find : ");
          char c = sc.next().charAt(0);
          int res = find(c,characters);
          System.out.println(res!=-1 ? "the character is in "+res+" index":"Character not found");
          sc.close();
     }
     public static int find(char c, List<Character> list){
          for(int i=0;i<list.size();i++){
               if(c == list.get(i)){
                    return i;
               }
          }
          return -1;
     }
}
