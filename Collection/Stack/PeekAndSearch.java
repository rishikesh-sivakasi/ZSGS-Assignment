package Stack;

import java.util.Collections;
import java.util.Stack;

public class PeekAndSearch {
     public static void main(String[] args) {
          Stack<String> stack = new Stack<>();
          Collections.addAll(stack,"first", "second", "third", "fourth");
          System.out.println("The top most element of the stack is :"+stack.peek());
          System.out.println("The position of the 'second' in the stack is "+ stack.search("second"));
     }
}
