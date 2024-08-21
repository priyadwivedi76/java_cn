package linkedList;

import java.util.Scanner;

public class appendLastToFirst {

    //take input
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

    public static Node<Integer> append(Node<Integer> head,int number){
        Node<Integer> temp=head;
        int length=0;

        //to check the length
        while(temp != null){
            length++;
            temp=temp.next;
        }

        Node<Integer> currentNode=head;
        int count=0;
        while(count<length-number-1){
            count++;
            currentNode=currentNode.next;
        }

        Node<Integer> newHead=currentNode.next;
        Node<Integer> tail=currentNode.next;
        int newCount=0;

        while(tail.next != null){
            newCount++;
            tail=tail.next;
        }
        tail.next=head;
        currentNode.next=null;
        return newHead;
    }

    //function to print linkedList
    public static void printLinkedList(Node<Integer> head){
        while(head !=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the linkedlist:");
        Node<Integer> head=takeInput();
        printLinkedList(head);
        System.out.println("Enter the number of node to append:");
        int number=sc.nextInt();
        Node<Integer> newHead=append(head, number);
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
