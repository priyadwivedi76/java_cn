package queue;

import java.util.EmptyStackException;

public class queueUsingLL {
    public static void main(String[] args) throws EmptyStackException{
        int input[]={3,4,5,1,2};
        Queue<Integer> queue=new Queue<>();
        for(int i=0;i<input.length;i++){
            queue.enqueue(input[i]);
        }
        while(!queue.isEmpty()){
            try{
                System.out.println(queue.dequeue());
            }catch(EmptyQueue e){
                System.out.println("Queue is empty");
            }
        }
    }
}

class Queue<T>{
    private Node<T> front;
    private Node<T> rear;
    private int size;

    //constructor
    public Queue(){
        front=null;
        rear=null;
        size=0;
    }

    public void enqueue(T elem){
        Node<T> newNode=new Node<>(elem);
        if(front==null && rear==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }

    public T dequeue() throws EmptyQueue{
        if(front==null && rear==null){
            throw new EmptyQueue();
        }
        T temp=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return temp;
    }
    
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T front() throws EmptyQueue{
        if (isEmpty()) {
            throw new EmptyQueue();
        }
        return front.data;
    }

    public T rear() throws EmptyQueue{
        if (isEmpty()) {
            throw new EmptyQueue();
        }
        return rear.data;
    }
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}

//custom exception class to handle empty queue exception
class EmptyQueue extends Exception{
    public String getMessage(){
        return "Queue is empty";
    }
}