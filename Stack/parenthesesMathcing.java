package Stack;

import java.util.ArrayDeque;

public class parenthesesMathcing {

    public static void main(String[] args) {
        String str = "{}";
        boolean check =isValidParentheses(str);
        System.out.println(check);
    }

    static boolean isValidParentheses(String str) {


        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false;

                else {
                    char opening = stack.pop();
                    if ((opening == '(' && curr == ')') || (opening == '{' && curr == '}') || (opening == '[' && curr == ']')) {
                        continue;
                    } else {
                        return false;
                    }
                }

            }


        }

        return stack.isEmpty();


    }
}
