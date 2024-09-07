package linkedList;
import java.util.Scanner;

public class mergeSorted {
    public static void main(String[] args) {
        System.out.println("Enter the elements of first linked list to merge:");
        Node<Integer> head1=takeInput();
        System.out.println("Enter the elements of second linked list to merge:");
        Node<Integer> head2=takeInput();
        System.out.println("The elements of first linked List are:");
        printRecursive(head1);
        System.out.println("The elements of first linked List are:");
        printRecursive(head2);
        Node<Integer> mergedHead=merge(head1, head2);
        System.out.println("After merging the elements:");
        printRecursive(mergedHead);
    }
    public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){
        Node<Integer> newHead=null;
        Node<Integer> newTail=null;

        if(head1.data < head2.data){
            newHead=head1;
            newTail=head1;
            head1=head1.next;
        }else{
            newHead=head2;
            newTail=head2;
            head2=head2.next;
        }

        while(head1 != null && head2 !=null){
            if(head1.data < head2.data){
                newTail.next=head1;
                newTail=newTail.next;
                head1=head1.next;
            }else{
                newTail.next=head2;
                newTail=newTail.next;
                head2=head2.next;
            }
        }

        if(head1 !=null){
            newTail.next=head1;
        }

        if(head2 !=null){
            newTail.next=head2;
        }
        return newHead;
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