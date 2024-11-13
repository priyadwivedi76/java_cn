package tree.BinaryTree;

import java.util.Scanner;

public class diameterImproved {
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
    public static InnerdiameterImproved getdiameter(BinaryTree<Integer> root){
        if(root==null){
            int height=0;
            int diameter=0;
            InnerdiameterImproved ans=new InnerdiameterImproved();
            ans.height=height;
            ans.diameter=diameter;
            return ans;
        }

        //get left diameter,height and right diameter,height
        InnerdiameterImproved leftTree=getdiameter(root.left);
        InnerdiameterImproved rightTree=getdiameter(root.right);

        //store diameter of left and right subtree
        int leftDiameter=leftTree.diameter;
        int rightDiameter=rightTree.diameter;

        //calculate overall distance
        int distance=leftTree.height+rightTree.height;
        
        //max height and diameter is stored
        int height=1+Math.max(leftTree.height,rightTree.height);
        int diameter=Math.max(leftDiameter,Math.max(rightDiameter,distance));


        //create a new object and pass the value and return the object
        InnerdiameterImproved ans=new InnerdiameterImproved();
        ans.height=height;
        ans.diameter=diameter;
        return ans;
    } 
    public static void main(String[] args) {
        BinaryTree<Integer> root=getInput(true,0,true);
        printDetailed(root);
        InnerdiameterImproved ans=getdiameter(root);
        System.out.println("The diameter of the tree is:"ans.diameter);
    }
}
class BinaryTree<T>{
    BinaryTree<T> left,right;
    T data;

    public BinaryTree(T data){
        this.data=data;
    }
}

class InnerdiameterImproved {
    int height;
    int diameter;
}