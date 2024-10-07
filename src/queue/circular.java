package queue;

public class circular {
    public static void main(String[] args) throws FullQueue,EmptyQueue {
        int[] arr={10,20,30,40};
        Queue queue = new Queue();
        for(int elem:arr){
            queue.enqueue(elem);
        }

        while(!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }
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
    public Queue(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int elem) throws FullQueue {
        if (size == data.length) {
            throw new FullQueue();
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
        data[rear] = elem;
        size++;
    }

    public int dequeue() throws EmptyQueue {
        if (isEmpty()) {
            throw new EmptyQueue();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        size--;
        if (isEmpty()) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public int front() throws EmptyQueue {
        if (isEmpty()) {
            throw new EmptyQueue();
        }
        return data[front];
    }

    public int rear() throws EmptyQueue {
        if (isEmpty()) {
            throw new EmptyQueue();
        }
        return data[rear];
    }
}


class EmptyQueue extends Exception{
    public String getMessage(){
        return "Queue is empty";
    }
}

class FullQueue extends Exception{
    public String getMessage(){
        return "Queue is full";
    }
}
