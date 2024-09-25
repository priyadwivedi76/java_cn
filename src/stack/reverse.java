package stack;
import java.util.Stack;
public class reverse {
    public static void reversedStack(Stack<Integer> main, Stack<Integer> extra) {
        if (main.size() <= 1) {
            return;
        }
        
        int lastElement = main.pop();
        reversedStack(main, extra);
        
        while (!main.isEmpty()) {
            extra.push(main.pop());
        }
        
        extra.push(lastElement);
        
        while (!extra.isEmpty()) {
            main.push(extra.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> main = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        int arr[] = {1, 2, 3, 4};

        for (int i : arr) {
            main.push(i);
        }

        System.out.println("Original stack: " + main);
        reversedStack(main, extra);
        
        System.out.println("Reversed stack: " + main);
    }
}