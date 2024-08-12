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

    
    //printing linkedList method
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
