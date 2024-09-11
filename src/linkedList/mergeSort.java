package linkedList;

import java.util.Scanner;

public class mergeSort {
    public static Node<Integer> merge(Node<Integer> head){
        if(head == null || head.next==null){
            return head;
        }

        //find the midpoint of linkedlist
        Node<Integer> mid=midpoint(head);
        Node<Integer> half1=head;
        Node<Integer> half2=mid.next;
        mid.next=null;
        //sort each section by recursion
        half1=merge(half1);
        half2=merge(half2);
        //merge the sorted list
       return mergeSorted(half1, half2);
        //return the head of new list
    }

//function to find the midpoint of the linkedlist
public static Node<Integer> midpoint(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head.next;
        
        while (fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


//function to merge two sorted lists
public static Node<Integer> mergeSorted(Node<Integer> head1,Node<Integer> head2){
        Node<Integer> newHead=null,tail=null;
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

       
            if(head1.data < head2.data){
                newHead=head1;
                tail=head1;
                head1=head1.next;
            }
            else{
                newHead=head2;
                tail=head2;
                head2=head2.next;
            }

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                tail.next=head1;
                head1=head1.next;
                tail=tail.next;
        }else{
            tail.next=head2;
            head2=head2.next;
            tail=tail.next;
        }
    }

    if(head1 != null){
        tail.next=head1;
    }
    if(head2 != null){
        tail.next=head2;
    }
    return newHead;
}

//take Input and store in linked list
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

    //printRecursive
public static void printRecursive(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printRecursive(head.next);
    }

    public static void main(String[] args) {
        System.out.println("Enter the linked list:");
        Node<Integer> head=takeInput();
        printRecursive(head);
        Node<Integer> newHeadAfterSort=merge(head);
        System.out.println(
            "The sorted linked list is:"
        );
        printRecursive(newHeadAfterSort);  
    }
}

//first class of Node
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    }
}