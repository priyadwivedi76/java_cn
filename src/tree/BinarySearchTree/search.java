package tree.BinarySearchTree;
import java.util.Scanner;


public class search {
    public static void main(String[] args){
        BinarySearchTree<Integer> root=getInput(true,0,true);
        System.out.println("Enter the element you want to search");
        Scanner sc=new Scanner(System.in);
        int elemToSearch=sc.nextInt();
        System.out.println(search(root, elemToSearch)?"Found":"Not Found");
    }

    public static boolean search(BinarySearchTree<Integer> root,int elemToSearch){
        if(root==null){
            return false;
        }

        if(root.data==elemToSearch){
            return true;
        }else if(root.data>elemToSearch){
            return search(root.left, elemToSearch);
        }else{
            return search(root.right, elemToSearch);
        }
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
    
}

class BinarySearchTree<T>{
    T data;
    BinarySearchTree<T> left, right;

    public BinarySearchTree(T data){
        this.data=data;
    }
}
