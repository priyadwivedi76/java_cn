package tree.BinarySearchTree;

import java.util.Scanner;

public class elementBetweenRange {
    public static void main(String[] args){
        BinarySearchTree<Integer> root=getInput(true,0,true);
        System.out.println("Enter the range you want to search");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minimum value:");
        int min=sc.nextInt();
        System.out.println("Enter maximum value:");
        int max=sc.nextInt();
        elementBetweenRange(root, min, max);
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

    public static void elementBetweenRange(BinarySearchTree<Integer> root,int min,int max){
        if(root==null){
            return;
        }
        if(root.data >= min && root.data<=max){
            elementBetweenRange(root.left, min, max);
            System.out.print(root.data+" ");
            elementBetweenRange(root.right, min, max);
        }else if(root.data<min){
            elementBetweenRange(root.right, min, max);
        }else if(root.data>max){
            elementBetweenRange(root.left, min, max);
        }
    }
    
}
class BinarySearchTree<T>{
    T data;
    BinarySearchTree<T> left, right;

    public BinarySearchTree(T data){
        this.data=data;
    }
}