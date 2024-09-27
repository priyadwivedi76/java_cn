package stack;
import java.util.Stack;
public class redundantBrackets {
    public static boolean hasRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // If the character is closing bracket
            if (ch == ')') {
                int operatorCount = 0;

                // Pop elements until we find the opening bracket
                while (!stack.isEmpty() && stack.peek() != '(') {
                    if (isOperator(stack.peek())) {
                        operatorCount++;
                    }
                    stack.pop();
                }

                // Pop the opening bracket
                stack.pop();

                // If there were no operators between the brackets, it's redundant
                if (operatorCount < 1) {
                    return true;
                }
            } else {
                // Push other characters onto the stack
                stack.push(ch);
            }
        }

        return false;
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static void main(String[] args) {
        String expression="(a+b)";
        boolean result=hasRedundantBrackets(expression);
        System.out.println(result);
    }
}
