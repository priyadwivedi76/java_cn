package stack;
import java.util.Queue;
import java.util.LinkedList;
public class Using2Queue {
    public static void main(String[] args) {
        UsingQueue<Integer> Queue=new UsingQueue<Integer>();
        Queue.push(10);
        Queue.push(20);
        Queue.push(30);
        Queue.push(40);
        System.out.println(Queue.size());
        System.out.println(Queue.pop());
        System.out.println(Queue.size());
    }
}

class UsingQueue<T>{
    Queue<T> queue1;
    Queue<T> queue2;
    private int size;

    public UsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        size = 0;
    }

    public void push(T elem){
        queue1.add(elem);
        size++;
    }

    public T pop(){
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }

        T ans=queue1.poll();
        Queue<T> temp=queue1;
        queue1=queue2;
        queue2=temp;
        size--;
        return ans;
    }

    public T top(){
        while(queue1.size()>1){
            queue2.add(queue1.poll());
        }

        T ans=queue1.poll();
        Queue<T> temp=queue1;
        queue1=queue2;
        queue2=temp;
        return ans;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
