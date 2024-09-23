package stack;

public class stackUsingLL {
    public static void main(String[] args) throws StackEmptyException {
        Stack<Integer> stack=new Stack<>();
        int arr[]={2,3,4,5};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

class Stack<T> {
    Node<T> head;
    private int size;

    public Stack(){
        head = null;
        size = 0;
    }

    //size
    public int size(){
        return size;
    }

    //isEmpty
    public boolean isEmpty(){
        return size==0;
    }

    //push
    public void push(T data){ 
        Node<T> newNode=new Node<>(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    //pop
    public T pop() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
        T elem=head.data;
        head=head.next;
        size--;
        return elem;
    }

    //top
    public T top() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
        return head.data;
    }
}
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}

class StackEmptyException extends Exception{

}