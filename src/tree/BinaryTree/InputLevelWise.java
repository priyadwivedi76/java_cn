
import java.util.*;

public class InputLevelWise {
    public static BinaryTree<Integer> inputLevel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root data:");
        int root=sc.nextInt();
        
        if(root==-1){
            return null;
        }
        BinaryTree<Integer> rootNode=new BinaryTree<>(root);
        Queue<BinaryTree<Integer>> queueNew=new LinkedList<>();
        queueNew.add(rootNode);

        while(!queueNew.isEmpty()){
            BinaryTree<Integer> frontChild=queueNew.poll();
            System.out.println("Enter the left Child "+frontChild.data+":");
            int leftData=sc.nextInt();
            if(leftData!=-1){
                BinaryTree<Integer> left=new BinaryTree<>(leftData);
                frontChild.left=left;
                queueNew.add(left);
            }
            System.out.println("Enter the right Child:"+frontChild.data+":");
            int rightData=sc.nextInt();
            if(rightData!=-1){
                BinaryTree<Integer> right=new BinaryTree<>(rightData);
                frontChild.right=right;
                queueNew.add(right);
            }
        }
        return rootNode;
    }


    public static void printLevelWise(BinaryTree<Integer> root){
        if(root==null){
            return;
        }

        Queue<BinaryTree<Integer>> rootNode=new LinkedList<>();
        rootNode.add(root);

        while(!rootNode.isEmpty()){
            BinaryTree<Integer> current=rootNode.poll();
            System.out.print(current.data+" ");

            if(current.left!=null){
                rootNode.add(current.left);
            }
            if(current.right!=null){
                rootNode.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree<Integer> root=inputLevel();
        printLevelWise(root);
    }
}

class BinaryTree<T>{
    BinaryTree<T> left,right;
    T data;

    public BinaryTree(T data){
        this.data=data;
    }
}




