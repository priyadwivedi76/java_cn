package stack;
import java.util.Stack;
public class balancedParenthesis {
    
    public static boolean balance(String expression) {
        Stack<Character> stack = new Stack<Character>();    
        
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            
            // Check for opening brackets
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } 
            // Check for closing brackets
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                
                // Check if the brackets match
                if ((currentChar == ')' && topChar != '(') || 
                    (currentChar == '}' && topChar != '{') || 
                    (currentChar == ']' && topChar != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();        
    }

    public static void main(String[] args) {
        String expression="{[()]}";
        boolean result=balance(expression);
        System.out.println("The expression is:"+result);
    }
}

