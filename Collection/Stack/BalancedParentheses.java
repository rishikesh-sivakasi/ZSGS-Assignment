package Stack;

import java.util.*;

public class BalancedParentheses {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Parentheses to check if it is balanced or not: ");
        String input = sc.next();
        boolean isBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    isBalanced = false; 
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        System.out.println(isBalanced ? "The given Parentheses are balanced." : "The given Parentheses are not balanced.");
        sc.close();
    }
}
