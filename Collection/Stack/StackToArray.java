package Stack;

import java.util.*;

public class StackToArray {
     public static void main(String[] args) {
          Stack<Double> stack = new Stack<>();
          Collections.addAll(stack, 1.1, 2.2, 3.3, 4.4, 5.5);
          Double da[] = stack.toArray(new Double[0]);
          System.out.println("Stack converted into array :"+Arrays.toString(da));
          Stack<Double> stack2 = new Stack<>();
          Collections.addAll(stack2, da);
          System.out.println("Array to new Stack :"+stack2);
     }
}
