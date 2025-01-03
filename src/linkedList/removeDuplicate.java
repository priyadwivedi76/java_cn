package linkedList;

import java.util.Scanner;

public class removeDuplicate {
    public static Node<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> head=null,tail=null;

        //data received in linked list if it is other than -1 if we get -1 stop the linkedlist
        while(data != -1){
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head == null){
                //if head is empty put the number recieved into the head node 
                head=currentNode;
                tail=currentNode;
            }
            else{
                //if head is not  empty connect  the next data to the tail to the head
                tail.next=currentNode;
                tail=tail.next;
            }
            //take the next data
            data=sc.nextInt();
        }
        return head;
    }
    //function to print linkedList
    public static void printLinkedList(Node<Integer> head){
        while(head !=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    //function to remove duplicates in linkedList
    public static void removeDuplicate(Node<Integer> head){
        Node<Integer> current=head;
        while(current.next!=null){
            if(current.data.equals(current.next.data)){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements in linkedList");
        Scanner sc=new Scanner(System.in);
        Node<Integer>  head=takeInput();
        printLinkedList(head);
        removeDuplicate(head);
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
