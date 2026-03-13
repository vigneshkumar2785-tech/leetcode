import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int y = stack.pop();
                int x = stack.pop();

                switch (token) {
                    case "+": stack.push(x + y); break;
                    case "-": stack.push(x - y); break;
                    case "*": stack.push(x * y); break;
                    case "/": stack.push(x / y); break; 
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
