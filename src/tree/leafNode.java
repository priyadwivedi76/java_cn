import java.util.ArrayList;
import java.util.Scanner;

public class leafNode {

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

    public static void printTree(Tree<Integer> root){
        String s=root.data+" ";
        //print root data and its children
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
    
        //print the children of the root
        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }
    }

    public static int leafNode(Tree<Integer> root){
        if(root==null){
            return 0;
        }

        int count=0;
        if(root.children.size()==0){
            count++;
            return count;
        }

        for(int i=0;i<root.children.size();i++){
            count+=leafNode(root.children.get(i));
        }
        return count;
    }
    
    public static void main(String[] args) throws EmptyQueue {
        Scanner sc=new Scanner(System.in);
        Tree<Integer> root=inputLevelWise();
        printTree(root);
        System.out.println("Number of leaf nodes: "+leafNode(root));
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