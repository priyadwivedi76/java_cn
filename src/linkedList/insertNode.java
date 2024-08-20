package linkedList;

import java.util.Scanner;

public class insertNode{
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

    public static void printLinkedList(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node<Integer> insertNode(Node<Integer> head,int elem,int position){
        Node<Integer> newNode=new Node<>(elem);
        if(position == 0){
            newNode.next=head;
            return newNode;
        }

        Node<Integer> currentNode=head;
        int count=0;

        while(count<position-1 && currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }

        newNode.next=currentNode.next;
        currentNode.next=newNode;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of linked list:");
        Node<Integer> head=takeInput();
        printLinkedList(head);
        System.out.println("Enter the position and the number to insert in the linkedList:");
        int number=sc.nextInt();
        int position=sc.nextInt();
        Node<Integer> newHead=insertNode(head, number, position);
        printLinkedList(newHead);
    }
}

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}
