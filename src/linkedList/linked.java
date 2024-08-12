package linkedList;

public class linked {

    //initialising linkedList
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        Node<Integer> n5=new Node<>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        return n1;
    }

    //printing linkedlist
    public static void printList(Node<Integer> head){
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    //main function
    public static void main(String[] args) {
        Node<Integer> head=createLinkedList(); 
        printList(head);
    }
}


//class to create an individual node
class Node<T>{
    T data;
    Node next;
    public Node(T data){
        this.data=data;
    }
}
