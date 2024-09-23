package stack;
import java.util.Stack;

public class useCollection {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int arr[]={5,4,2,3,1};

       for(int i:arr){
        stack.push(i);
       }

       while(!stack.isEmpty()){
        System.out.println(stack.pop());
       }
    }
}
