package tree.BinarySearchTree;
import java.util.Scanner;

public class lca {
    public static BinarySearchTree<Integer> CommonAncestor(BinarySearchTree<Integer> tree,int firstNode,int secondNode){
        while(tree!=null){
            if(tree.data>firstNode && tree.data>secondNode){
                tree=tree.left;
            }
            else if(tree.data<firstNode && tree.data<secondNode){
                tree=tree.right;
            }
            else{
                return tree;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinarySearchTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        System.out.println("Enter the first node:");
        int first=sc.nextInt();
        System.out.println("Enter the second node:");
        int second=sc.nextInt();
        BinarySearchTree<Integer> lca=CommonAncestor(root,first,second);
        System.out.println("Common ancestor of "+first+" and "+second+" is: "+lca.data);
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
}
class BinarySearchTree<T>{
    T data;
    BinarySearchTree<T> left,right;

    public BinarySearchTree(T data){
        this.data=data;
    }
}