package Stack;

import java.util.ArrayDeque;

public class EvaluatingPostFix {

    public static void main(String[] args) {
        String expression = "2 1 + 3 *";
        System.out.println(evaluate(expression));

    }

    static boolean isOpeartor(String s){
        return (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") || s.equals("^"));
    }

    static int evaluate(String str){
        String tokens[] = str.split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(String token: tokens){

            if(isOpeartor(token)){
                int second = stack.pop();
                int first = stack.pop();
                int result =0;

                switch (token){
                    case "+":
                        result = first +second;
                        break;
                        case "-":
                        result = first -second;
                        break;
                        case "*":
                        result = first *second;
                        break;
                        case "/":
                        result = first /second;
                        break;

                    case "^":
                        result = (int) Math.pow(first,second);

                }

                stack.push(result);
            }

            else{
                stack.push(Integer.parseInt(token));
            }

        }
        return  stack.pop();
    }
}
