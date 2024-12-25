package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
     public static void main(String[] args) {
          Stack<Character> stack = new Stack<>();
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the String :");
          String temp = sc.next();
          for (int index = 0; index < temp.length(); index++) {
               stack.push(temp.charAt(index));
          }
          String reverse = "";
          while (!stack.isEmpty()) {
               reverse += stack.pop();
          }
          System.out.println("Reverse of the string '"+temp+"' is "+reverse);
          sc.close();
     }
}
