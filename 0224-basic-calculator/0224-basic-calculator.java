import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int result = 0;
        int number = 0;
        int sign = 1; 
        Stack<Integer> stack = new Stack<>();
        stack.push(sign); 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = stack.peek();
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -stack.peek();
            } else if (c == '(') {
                stack.push(sign); 
            } else if (c == ')') {
                stack.pop(); 
            }
        }
        
        result += sign * number; 
        return result;
    }
}
