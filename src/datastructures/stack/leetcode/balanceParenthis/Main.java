package datastructures.stack.leetcode.balanceParenthis;

import java.util.ArrayList;

public class Main {

    // WRITE THE ISBALANCEDPARENTHESES METHOD HERE //
    public static boolean isBalancedParentheses(String parentheses) {
        StackArrayList<Character> stack = new StackArrayList<>();
        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()()()";
        String s2 = "()(()";
        String s3 = "(()())";
        System.out.println(isBalancedParentheses(s1)); // true
        System.out.println(isBalancedParentheses(s2)); // false
        System.out.println(isBalancedParentheses(s3)); // true

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
        */
    }


    static class StackArrayList<T> {

        private final ArrayList<T> stackList = new ArrayList<>();

        public ArrayList<T> getStackList() {
            return stackList;
        }

        public void printStack() {
            for (int i = stackList.size() - 1; i >= 0; i--) {
                System.out.println(stackList.get(i));
            }
        }

        public void printStack2() {
            stackList.forEach(System.out::println);
        }

        public boolean isEmpty() {
            return stackList.isEmpty();
        }

        public T peek() {
            if (isEmpty()) {
                return null;
            } else {
                return stackList.get(stackList.size() - 1);
            }
        }

        public int size() {
            return stackList.size();
        }

        public void push(T value) {
            stackList.add(value);
        }

        public T pop() {
            if (isEmpty()) return null;

            return stackList.remove(stackList.size() - 1);

        }

    }
}
