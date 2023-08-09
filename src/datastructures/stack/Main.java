package datastructures.stack;

// WRITE THE REVERSESTRING METHOD HERE //


class Main {

//        public static String reverseString(String input ){
//
//                StackArrayList<Character> list = new StackArrayList<>();
//
//                StringBuilder reversedString = new StringBuilder();
//
//                for (int i = 0; i < input.length(); i++) {
//
//                       list.push(input.charAt(i));
//                }
//
//
//                for (int i = 0; i < input.length(); i++) {
//
//                       reversedString.append(list.pop());
//                }
//
//                return reversedString.toString();
//        }

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
