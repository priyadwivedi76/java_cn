package queue;
import java.util.LinkedList;
import java.util.Queue;

public class collection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        System.out.println("The size of the queue is:"+queue.size());
        System.out.println("The front of the queue is:"+queue.peek());
        System.out.println("The rear of the queue is:"+queue.poll());
        System.out.println("The size of the queue is:"+queue.size());
    }
}
