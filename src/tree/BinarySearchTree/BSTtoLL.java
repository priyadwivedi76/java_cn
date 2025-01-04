import java.util.Scanner;

public class BSTtoLL {
    public static LinkedList constructLinkedList(BinarySearchTree<Integer> root){
        if(root==null){
            LinkedList newNode=new LinkedList();
            return newNode;
        }

        Node<Integer> rootNode=new Node<Integer>(root.data);
        LinkedList leftList=constructLinkedList(root.left);
        LinkedList rightList=constructLinkedList(root.right);
        LinkedList pair=new LinkedList();
        if(leftList.tail != null){
            leftList.tail.next=rootNode;
        }
        rootNode.next=rightList.head;

        if(leftList.head != null){
            pair.head=leftList.head;
        }else{
            pair.head=rootNode;
        }

        if(rightList.tail != null){
            pair.tail=rightList.tail;
        }else{
            pair.tail=rootNode;
        }
        return pair;
    }
    public static void printDetailed(BinarySearchTree<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data +":");
        if(root.left!=null){
            System.out.print("L"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printDetailed(root.left);
        printDetailed(root.right);
    }

    public static BinarySearchTree<Integer> getInput(boolean isRoot,int ParentData,boolean isLeft){
        if(isRoot){
            System.out.println("Enter the root:");
        }else{
            if(isLeft){
                System.out.println("Enter the left child of "+ParentData);
            }else{
                System.out.println("Enter the right child of "+ParentData);
            }
        }
        Scanner sc=new Scanner(System.in);
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinarySearchTree<Integer> root=new BinarySearchTree<>(rootData);
        BinarySearchTree<Integer> leftChild=getInput(false,root.data,true);
        BinarySearchTree<Integer> rightChild=getInput(false,root.data,false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }

    public static void printList(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static Node<Integer> createLinkedList(BinarySearchTree<Integer> root){
        return constructLinkedList(root).head;
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        System.out.println("Now the converted BST to Linked List is:");
        Node<Integer> linkedList=createLinkedList(root);
        printList(linkedList);
    }
}
class LinkedList{
    Node<Integer> head;
    Node<Integer> tail;
}
//class to create an individual node
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data=data;
    }
}

class BinarySearchTree<T>{
    T data;
    BinarySearchTree<T> left,right;

    public BinarySearchTree(T data){
        this.data=data;
    }
}