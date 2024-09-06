package linkedList;

import java.util.Scanner;

public class midPoint {
    public static int midPoint(Node<Integer> head){
        if(head == null || head.next == null){
            return head.data;
        }
        Node<Integer> slow=head;
        Node<Integer> fast=head.next;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

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

    public static void main(String[] args) {
        System.out.println("Enter the elements of linkedList:");
        Node<Integer> head=takeInput();
        printRecursive(head);
        int midPoint=midPoint(head);
        System.out.println("The mid point of the linked list is:"+midPoint);
    }
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}
