package Stack;

import java.util.Stack;

public class Basic {
     public static void main(String[] args) {
          Stack<Integer> stack = new Stack<>();
          stack.push(10);
          stack.push(20);
          stack.push(30);
          stack.push(40);
          System.out.println("Original stack :"+stack);
          stack.pop();
          System.out.println("After pop the one element : "+stack);
     }
}
