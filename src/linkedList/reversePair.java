package linkedList;

import java.util.Scanner;

public class reversePair {
    public static Node<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> head=null,tail=null;
        while(data != -1){
            Node<Integer> currentNode=new Node<>(data);
            if(head == null){
                head=currentNode;
                tail=currentNode;
            }else{
                tail.next=currentNode;
                tail=tail.next;
            }
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

    public static DoubleNode RecursiveBReverse(Node<Integer> head){
        DoubleNode ans;
        if(head == null || head.next == null){
            ans=new DoubleNode(head, head);
            return ans;
        }
        DoubleNode smallHead=RecursiveBReverse(head.next);
        smallHead.tail.next=head;
        head.next=null;
        ans=new DoubleNode(smallHead.head, head);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements in the linkedList:");
        Node<Integer> head=takeInput();
        System.out.println("Element you entered:");
        printRecursive(head);
        System.out.println("The elements after getting reverse is:");
        DoubleNode ans=RecursiveBReverse(head);
        printRecursive(ans.head);
    }
}

//classes and objects
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}

class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
    public DoubleNode(Node<Integer> head,Node<Integer> tail){
        this.head=head;
        this.tail=tail;
    }        
}