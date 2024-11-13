package tree.BinaryTree;

import java.util.Scanner;

public class balancedImproved {
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

    public static BinaryTreeBetter heightAndBalance(BinaryTree<Integer> root){
        if(root==null){
            BinaryTreeBetter ans=new BinaryTreeBetter();
            ans.height=0;
            ans.isBalanced=true;
            return ans;
        }

        BinaryTreeBetter leftTreeBetter=heightAndBalance(root.left);
        BinaryTreeBetter rightTreeBetter=heightAndBalance(root.right);
        int height=1+Math.max(leftTreeBetter.height,rightTreeBetter.height);
        boolean isBal=true;

        if((leftTreeBetter.height - rightTreeBetter.height)>1){
            isBal=false;
        }

        if(!leftTreeBetter.isBalanced || !rightTreeBetter.isBalanced){
            isBal=false;
        }

        BinaryTreeBetter ans=new BinaryTreeBetter();
        ans.height=height;
        ans.isBalanced=isBal;
        return ans;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        System.out.print("Return true for balanced and false for not balanced:");
        BinaryTreeBetter ans=heightAndBalance(root);
        System.out.println(ans.isBalanced);
    }
    
}

class BinaryTree<T>{
    BinaryTree<T> left,right;
    T data;

    public BinaryTree(T data){
        this.data=data;
    }
}

class BinaryTreeBetter{
    int height;
    boolean isBalanced;
}