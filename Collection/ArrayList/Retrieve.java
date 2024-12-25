package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retrieve {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          List<String> fruits = new ArrayList<>();
          System.out.println("Enter the five fruits name");
          for (int i = 0; i < 5; i++) {
               fruits.add(sc.next());
          }
          System.out.println("Enter the searching position");
          int index = sc.nextInt();
          if(index <= 5 && index > 0){
               System.out.println("The element in the position "+index+" is "+fruits.get(--index));
          }else{
               System.out.println("IndexOutOfBound : Enter the correct index");
          }
          sc.close();
     }
}