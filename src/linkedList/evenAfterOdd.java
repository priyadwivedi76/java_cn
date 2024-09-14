package linkedList;

import java.util.Scanner;

public class evenAfterOdd {
    //printRecursive
    public static void printRecursive(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    //function to put even after odd
    public static Node<Integer> evenAndOdd(){
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=null,tail=null;
        int data=sc.nextInt();
        while(data!=-1){
            Node<Integer> currentNode=new Node<>(data);
            if(head==null){
                head=currentNode;
                tail=currentNode;
            }else{
                if(tail.data%2==0 && currentNode.data%2==0){
                    System.out.println("Cant enter even data next to the even data");
                    return head;
                }else if(tail.data%2!=0 && currentNode.data%2!=0){
                    System.out.println("Cant enter odd data next to the odd data");
                    return head;
                }
                else{
                    tail.next=currentNode;
                    tail=tail.next;
                }
            }
            data=sc.nextInt();
        }
        return head; 
    }

    public static void main(String[] args){
        System.out.println("Enter the elements but make sure to enter the odd after the even and vise versa");
        Node<Integer> head=evenAndOdd();
        System.out.println("The linked list you have entered is:");
        printRecursive(head);
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
