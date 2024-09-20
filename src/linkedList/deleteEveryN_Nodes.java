package linkedList;

import java.util.Scanner;
public class deleteEveryN_Nodes {
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

    //second method to printRecursive
    public static void printRecursive(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    public static Node<Integer> delete(Node<Integer> head, int m, int n) {
        // If the head is null or m is 0, return the original head
        if (head == null || m == 0) {
            return head;
        }
    
        Node<Integer> currentNode = head;
        Node<Integer> prevNode = null;
    
        while (currentNode != null) {
            // Take m nodes
            int take = 0;
            while (currentNode != null && take < m) {
                prevNode = currentNode; // Keep track of the last node to take
                currentNode = currentNode.next;
                take++;
            }
    
            // Skip n nodes
            int skip = 0;
            while (currentNode != null && skip < n) {
                currentNode = currentNode.next;
                skip++;
            }
    
            // Connect the last node taken to the next node after skipping
            if (prevNode != null) {
                prevNode.next = currentNode;
            }
        }
    
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        printRecursive(head);
        System.out.println("Enter m and n:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        Node<Integer> newHead=delete(head, m, n);
        printRecursive(newHead);
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