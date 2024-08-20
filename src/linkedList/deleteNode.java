package linkedList;

import java.util.Scanner;

public class deleteNode {
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

    //function to delete the node from linkedlist
    public static Node<Integer> deleteNode(Node<Integer> head,int position){
        
        if(position==0){
            head=head.next;
            return head;
        }

        Node<Integer> currentNode=head;
        int count=0;

        while(count<position-1 && currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }
        if(currentNode!=null){
            currentNode.next=currentNode.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the linked list:");
        Node<Integer> head=takeInput();
        System.out.println("The entered linked list is:");
        printLinkedList(head);
        System.out.println("The position to delete the element in the linked list is:");
        int position=sc.nextInt();
        Node<Integer> newHead=deleteNode(head, position);
        System.out.println("The linked list after deletion of element is:");
        printLinkedList(newHead);
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