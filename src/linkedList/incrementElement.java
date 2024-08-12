package linkedList;  
public class incrementElement {
    //initialise the node
    public static Node<Integer> createLinkedList(){
        Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(20);
        Node<Integer> node3=new Node<>(30);

        node1.next=node2;
        node2.next=node3;

        return node1;
    }

    //printing linked list
    public static void printLinkedList(Node<Integer> head){
        Node<Integer> temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    //increment every element in linked list
    public static void increment(Node<Integer> head){
        Node<Integer> element=head;
        while(element!=null){
            element.data++;
            element=element.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head=createLinkedList();
        increment(head);
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