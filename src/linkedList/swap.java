package linkedList;

import java.util.Scanner;
public class swap {
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

    public static Node<Integer> swapNodes(Node<Integer> head,int index1,int index2){
        Node<Integer> dummy=new Node<Integer>(0);
        Node<Integer> prev1=dummy,node1=head;
        Node<Integer> prev2=dummy,node2=head;
        for(int i=0;i<Math.max(index1, index2);i++){
            if(i<index1){
                prev1=node1;
                node1=node1.next;
            }
            if(i<index2){
                prev2=node2;
                node2=node2.next;
            }
        }

    if(prev1 !=null){
            prev1.next=node2;
            prev2.next=node1;

            Node<Integer> temp=node1.next;
            node1.next=node2.next;
            node2.next=temp;
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in linkedList:");
        Node<Integer> head=takeInput();
        printRecursive(head);
        System.out.println("Enter the index to be swapped:");
        int index1=sc.nextInt();
        int index2=sc.nextInt();
        Node<Integer> newhead=swapNodes(head, index1, index2);
        printRecursive(newhead);
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
