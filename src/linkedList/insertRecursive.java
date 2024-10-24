package linkedList;

import java.util.Scanner;

public class insertRecursive {
    
    //second method to printRecursive
    public static void printRecursive(Node<Integer> head){
        if(head==null){
            return; 
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }


    //insert node recursively
    public static Node<Integer> insertR(Node<Integer> head,int element,int position){

        if(head==null && position>0){
            return head;
        }
        
        if(position==0){
            Node<Integer> elementNode=new Node<>(element);
            elementNode.next=head;
            return elementNode;
        }else{
            head.next=insertR(head.next, element, position-1);
            return head;
        }
    }

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
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in linkedList");
        Node<Integer> head=takeInput();
        printRecursive(head);
        System.out.println();
        System.out.println("Enter the element:");
        int element=sc.nextInt();
        System.out.println("Enter the position");
        int position=sc.nextInt();
        System.out.println("After insertion:");
        head=insertR(head, element, position);
        printRecursive(head);
    }
}

//class to create node
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}
