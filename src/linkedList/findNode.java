package linkedList;

import java.util.Scanner;

public class findNode {

    //function to take input for linked list
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

    public static int search(Node<Integer> head,int number){
        int count=0;
        Node<Integer> currentNode=head;
        Node<Integer> element=new Node<>(number);
        while(currentNode!=null){
            if(currentNode.data != element.data){
                count++;
                currentNode=currentNode.next;
            }else{
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements in the linked list:");
        Scanner sc=new Scanner(System.in);
        Node<Integer> head=takeInput();
        System.out.println("Enter the value to search in the linked list:");
        int number=sc.nextInt();
        int result=search(head, number);
        if(result==-1){
            System.out.println("The number you entered is not found");
        }else{
            System.out.println("The number you entered is "+number+" which is found at position:"+result);
        }
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
