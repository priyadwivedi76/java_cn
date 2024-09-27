package queue;

public class queueUsingArray {
    public static void main(String[] args) throws EmptyQueue{
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.size()); // Output: 3
        q.dequeue();
        System.out.println(q.size());
    }
    
}
class Queue{
    private int[] data;
    private int rear;
    private int front;
    private int size;

    public Queue(){
        data=new int[5];
        front=-1;
        rear=-1;
    }
    public Queue(int capacity){
        data=new int[capacity];
        front=-1;
        rear=-1;
    }
    
    public int size(){
        return size+1;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int elem){
        if(front==-1 && rear==-1){
            data[++front]=elem;
            data[++rear]=elem;
        }else{
            rear++;
            data[rear]=elem;
            size++;
        }
    }
    public void dequeue() throws EmptyQueue{
        if(front==-1 && rear==-1){
            throw new EmptyQueue();
        }else{
           rear--;
           size--;
        }
    }
    public int front(){
        return data[front];
    }
    public int rear(){
        return data[rear];
    }
}

class EmptyQueue extends Exception{
    public String getMessage(){
        return "Queue is empty";
    }
}