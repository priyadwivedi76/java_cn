package linkedList;

import java.util.Scanner;

public class deleteRecursive {
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

    public static void printRecursive(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    public static Node<Integer> deleteR(Node<Integer> head,int position){
        if(position==0){
            return head.next;
        }else{
            head.next=deleteR(head.next, position-1);
            return head;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of linkedList");
        Node<Integer> head=takeInput();
        printRecursive(head);
        System.out.println();
        System.out.println("Enter the position to delete:");
        int position=sc.nextInt();
        deleteR(head, position);
        printRecursive(head);
    }
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}
