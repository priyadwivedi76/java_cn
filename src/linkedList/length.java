package linkedList;
import linkedList.*;

public class length {
    public static int length(Node<Integer> head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void printList(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node<Integer> createList(){
        Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(20);
        Node<Integer> node3=new Node<>(30);
        node1.next=node2;
        node2.next=node3;
        return node1;
    }

    public static void main(String[] args) {
        Node<Integer> head=createList();
        printList(head);
        System.out.println(length(head));
    }
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}

