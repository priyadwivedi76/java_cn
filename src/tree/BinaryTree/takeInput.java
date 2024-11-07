package tree.BinaryTree;
import java.util.Scanner;

public class takeInput {
    public static BinaryTree<Integer> getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root of the tree");
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTree<Integer> root=new BinaryTree<>(rootData);
        BinaryTree<Integer> leftChild=getInput();
        BinaryTree<Integer> rightChild=getInput();
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

    public static void main(String[] args) {
        BinaryTree<Integer> root=getInput();
        printDetailed(root);
    }

}

class BinaryTree<T>{
    T data;
    BinaryTree<T> left,right;

    public BinaryTree(T data){
        this.data=data;
    }
}
