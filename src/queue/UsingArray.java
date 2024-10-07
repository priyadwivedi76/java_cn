package queue;

public class UsingArray {
    public static void main(String[] args) throws EmptyQueue{
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.size()); // Output: 3
        int deleted=q.dequeue();
        System.out.println(deleted);
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

    public int[] dynamic(){
        int[] temp=data;
        data=new int[temp.length*2];
        int index=0;
        //put elements that are inserted in the queue at first if the front is greater than rear than it means they are in circular queue, to make sure fifo is maintained we first add the elements into the queue and then the rear elements
        for(int i=front;i<temp.length;i++){
            data[index++]=temp[i];
        }

        //add the rear elements into the queue
        for(int i=0;i<front-1;i++){
            data[index++]=temp[i];
        }
        front=0;
        rear=temp.length-1;
        return data;
    }
    
    //gives out the size of the queue
    public int size(){
        return size+1;
    }

    //checks if the queue is empty or not
    public boolean isEmpty(){
        return size==0;
    }

    //insert an element into the queue
    public void enqueue(int elem){
        if(front==-1 && rear==-1){
            data[++front]=elem;
            data[++rear]=elem;
            return;
        }

        //if the queue is full then resize it
        if(rear==data.length-1){
            dynamic();
        }
        rear++;
        data[rear]=elem;
        size++;
    }
    
    //removes an element from the queue and returns it
    public int dequeue() throws EmptyQueue{
        if(front==-1 && rear==-1){
            throw new EmptyQueue();
        }
        int temp=data[front];
        front++;
        size--;
        return temp;
    }

    //returns the front element of the queue without removing it
    public int front(){
        return data[front];
    }

    //returns the rear element of the queue without removing it
    public int rear(){
        return data[rear];
    }
}


//custom exception class to handle empty queue exception
class EmptyQueue extends Exception{
    public String getMessage(){
        return "Queue is empty";
    }
}