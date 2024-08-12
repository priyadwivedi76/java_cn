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

    //printing linkedlist method-1
    public static void printList(Node<Integer> head){
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println(head.next.next.next.next.data);
    }

    //printing linkedList method-2
    public static void printLinkedList(Node<Integer> head1){
        while(head1!=null){
            System.out.println(head1.data);
            head1=head1.next;
        }
    }

    //main function
    public static void main(String[] args) {
        Node<Integer> head=createLinkedList(); 
        printLinkedList(head);
    }
}


//class to create an individual node
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}
