package tree.BinaryTree;

import java.util.Scanner;

public class largestData {
    public static BinaryTree<Integer> getInput(boolean isRoot,int ParentData,boolean isLeft){
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
        BinaryTree<Integer> root=new BinaryTree<>(rootData);
        BinaryTree<Integer> leftChild=getInput(false,root.data,true);
        BinaryTree<Integer> rightChild=getInput(false,root.data,false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }

    public static int largest(BinaryTree<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftLargest=largest(root.left);
        int rightLargest=largest(root.right);
        return Math.max(root.data,Math.max(leftLargest, rightLargest));
    }

    public static void printDetailed(BinaryTree<Integer> root){
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
        BinaryTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        int largest=largest(root);
        System.out.println("The largest data in the tree is:"+largest);
    }
}

class BinaryTree<T>{
    T data;
    BinaryTree<T> left,right;

    public BinaryTree(T data){
        this.data=data;
    }
}
