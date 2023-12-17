package datastructures.stack.leetcode.reverseString;

// WRITE THE REVERSESTRING METHOD HERE //


import datastructures.stack.StackArrayList;

class Main {

        public static String reverseString(String string) {
                StackArrayList<Character> stack = new StackArrayList<>();
                StringBuilder reversedString = new StringBuilder();

                for (char c : string.toCharArray()) {
                        stack.push(c);
                }

                while (!stack.isEmpty()) {
                        reversedString.append(stack.pop());
                }

                return reversedString.toString();
        }

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }
}
