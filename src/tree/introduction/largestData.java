package tree;

import java.util.ArrayList;
import java.util.Scanner;

public class largestData {

    public static int largest(Tree<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        int ans=root.data;
        for(int i=0;i<root.children.size();i++){
            int ChildLargest=largest(root.children.get(i));
            if(ChildLargest > ans){
                ans=ChildLargest;
            }
        }
        return ans;
    }
    public static Tree<Integer> inputLevelWise() throws EmptyQueue{
        Scanner sc=new Scanner(System.in);
        Queue<Tree<Integer>> pendinNode=new Queue<>();
        System.out.println("Enter the root node");
        int rootData=sc.nextInt();
        Tree<Integer> root=new Tree<Integer>(rootData);
        pendinNode.enqueue(root);
        while(!pendinNode.isEmpty()){
            try{
                Tree<Integer> frontNode=pendinNode.dequeue();
                System.out.println("Enter the number of children of "+frontNode.data);
                int childCount=sc.nextInt();
                for(int i=0;i<childCount;i++){
                    System.out.println("Enter the "+(i+1)+" child of the node"+frontNode.data);
                    int childData=sc.nextInt();
                    Tree<Integer> childNode=new Tree<>(childData);
                    frontNode.children.add(childNode);
                    pendinNode.enqueue(childNode);
                }
            }catch(Exception e){
                throw new EmptyQueue();
            }
        }
        return root;
    }

    public static void printLevelWise(Tree<Integer> root) throws EmptyQueue{
        Queue<Tree<Integer>> PendingNode=new Queue<>();
        PendingNode.enqueue(root);
        while(!PendingNode.isEmpty()){
            try{
                Tree<Integer> frontNode=PendingNode.dequeue();
                System.out.print(frontNode.data+":");
                for(int i=0;i<frontNode.children.size();i++){
                    System.out.print(frontNode.children.get(i).data+",");
                    PendingNode.enqueue(frontNode.children.get(i));
                }
                System.out.println();
            }catch(Exception e){
                throw new EmptyQueue();
            }
        }
    }

    public static void main(String[] args) throws EmptyQueue {
        Scanner sc=new Scanner(System.in);
        Tree<Integer> root=inputLevelWise();
        printLevelWise(root);
        System.out.println("Largest data of tree is: "+largest(root));
    }
}
class Tree<T>{
    T data;
    ArrayList<Tree<T>> children;
    public Tree(T data){
        this.data=data;
        children = new ArrayList<>();
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