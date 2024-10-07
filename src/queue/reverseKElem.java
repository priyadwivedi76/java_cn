package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseKElem {
    public static Queue<Integer> reverseElem(Queue<Integer> input,int k){
        if(input.size()<=1 || k>=input.size()){
            return input;
        }

        if(k<=0){
            return input;
        }

        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<k;i++){
            stack.push(input.poll());
        }
        while(!stack.isEmpty()){
            input.add(stack.pop());
        }
        for(int i=0;i<input.size()-k;i++){
            input.add(input.poll());
        }

        return input;
    }

    public static void main(String[] args){
        Queue<Integer> queue =new LinkedList<>();
        int[] input={10,20,30,40,50,60};
        for(int elem:input){
            queue.add(elem);
        }
        Queue<Integer> reversedQueue=new LinkedList<>();
        reversedQueue=reverseElem(queue,3);
        while(!reversedQueue.isEmpty()){
            System.out.println(reversedQueue.poll());
        }
    }
}
