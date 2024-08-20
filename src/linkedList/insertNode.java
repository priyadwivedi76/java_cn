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
        //for head,if the position is at head join it to the next element and return head
        if(position == 0){
            newNode.next=head;
            return newNode;
        }

        //create node to make changes and make iteration such that the tranverse is made from 0 to position-1
        Node<Integer> currentNode=head;
        int count=0;

        //transverse the count and the  current node changes
        while(count<position-1 && currentNode!=null){
            count++;
            currentNode=currentNode.next;
        }

        //position reached and thus connect new node to the next node and then break the connection between the currentnode and the nextnode to join it with the new node
        //rule of make before break must be applied.
        if(currentNode!=null){
            newNode.next=currentNode.next;
            currentNode.next=newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //insert elements in linked list
        System.out.println("Enter the elements of linked list:");
        Node<Integer> head=takeInput();

        //print the linkedlist
        printLinkedList(head);
        System.out.println("Enter the position and the number to insert in the linkedList:");

        //enter number and position
        int number=sc.nextInt();
        int position=sc.nextInt();

        //print new linkedlist and then print the new linked list
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
