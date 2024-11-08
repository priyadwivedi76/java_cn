package tree.BinaryTree;

import java.util.Scanner;

public class GreaterThanN {

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

    public static int findGreater(BinaryTree<Integer> root, int n){
        if(root==null){
            return 0;
        }
        int count=(root.data>n)?1:0;
        count+=findGreater(root.left, n);
        count+=findGreater(root.right, n);
        return count;
    }

    public static void main(String[] args) {
        BinaryTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        int count=findGreater(root, 4);
        System.out.println("The count of nodes greater than given count is:"+count);
    }
}

class BinaryTree<T>{
    BinaryTree<T> left,right;
    T data;

    public BinaryTree(T data){
        this.data=data;
    }
}
