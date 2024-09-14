package linkedList;

import java.util.Scanner;

public class findNode2 {
    public static int findNode2(Node<Integer> head,int key){
        int count=0;
        if(head==null){
            return count;
        }

        count=(head.data==key) ? 1:0;
        return count+findNode2(head.next,key);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements to input in the linked list:");
        Node<Integer> head=takeInput();
        printRecursive(head);
        System.out.println("Enter the number to search in the linked list:");
        int key=sc.nextInt();
        int index=findNode2(head,key);
        if(index != -1){
            System.out.println("The index is:"+index);
        }else{
            System.out.println("The number not found");
        }
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
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}
