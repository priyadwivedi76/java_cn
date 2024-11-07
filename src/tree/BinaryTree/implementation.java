import java.util.Scanner;
public class implementation{

    //direct print: Problem occured as the output can have multiple structures of the same
    public static void print(BinaryTree<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    //more detailed print function
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
        BinaryTree<Integer> root=new BinaryTree<>(1);
        BinaryTree<Integer> rootleft=new BinaryTree<>(2);
        BinaryTree<Integer> rootright=new BinaryTree<>(3);
        root.left=rootleft;
        root.right=rootright;
        BinaryTree<Integer> rootleft1=new BinaryTree<>(4);
        BinaryTree<Integer> rootleft2=new BinaryTree<>(5);
        BinaryTree<Integer> rootright1=new BinaryTree<>(6);
        rootleft.left=rootleft1;
        rootleft.right=rootleft2;
        rootright.left=rootright1;
        printDetailed(root);
    }
}

class BinaryTree<T>{
    T data;
    BinaryTree<T> left, right;

    BinaryTree(T data){
        this.data=data;
    }
}