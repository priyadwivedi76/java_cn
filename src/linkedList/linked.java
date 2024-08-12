package linkedList;

public class linked {
    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(10);
        System.out.println(n1.data);
    }
}

class Node<T>{
    T data;
    Node next;
    public Node(T data){
        this.data=data;
    }
}
