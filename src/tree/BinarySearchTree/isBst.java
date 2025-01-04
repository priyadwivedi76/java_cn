package tree.BinarySearchTree;

import java.util.Scanner;

public class isBst {
    public static boolean isBST(BinarySearchTree<Integer> root,int minimum,int maximum){
        if(root == null){
            return true;
        }
        if (root.data <= minimum || root.data >= maximum) {
            return false;
        }
        return isBST(root.left,minimum,root.data) && isBST(root.right,root.data,maximum);
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
    public static void main(String[] args) {
        BinarySearchTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        boolean isBST=isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(isBST){
            System.out.println("The tree you have entered is Binary Search Tree");
        }else{
            System.out.println("The tree you have entered is not a Binary Search Tree");
        }
    }
    
}
class BinarySearchTree<T>{
    T data;
    BinarySearchTree<T> left,right;

    public BinarySearchTree(T data){
        this.data=data;
    }
}