package linkedList;

import java.util.Scanner;

public class ithNode {
    //create list
    public static Node<Integer> createList(){
        Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(40);
        Node<Integer> node3=new Node<>(30);
        Node<Integer> node4=new Node<>(20);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        return node1;
    }

    //print list
    public static void printList(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    //print ith element
    public static int ith(int i,Node<Integer> head){
        int count=0;
        while(head!=null){
            if(count<i){
                count++;
                head=head.next;
            }else if(count==i){
                return head.data;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=createList();
        printList(head);
        System.out.println("Enter the number of element that you want:");
        int number=sc.nextInt();
        System.out.println(ith(number, head));
    }
}


class Node<T>{
    T data;
    Node <T> next;
    public Node(T data){
        this.data=data;
    }
}