package tree.BinarySearchTree;

public class sortedToBST {
    public static BinarySearchTree<Integer> sortedToBST(int[] array,int start,int end) {
        if(start>end){
            return null;
        }

        int mid=start+(end-start)/2;
        BinarySearchTree<Integer> root=new BinarySearchTree<Integer>(array[mid]);
        root.left=sortedToBST(array, start, mid-1);
        root.right=sortedToBST(array, mid+1,end);
        return root;
    }

    public static BinarySearchTree<Integer> sortBetter(int arr[]){
        return sortedToBST(arr, 0, arr.length-1);
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
        int arr[]={1,2,3,4,5,6,7};
        BinarySearchTree<Integer> tree=sortBetter(arr);
        System.out.println("Conversation of sorted arrays into binary search tree:");
        printDetailed(tree);
    }
}
class BinarySearchTree<T>{
    T data;
    BinarySearchTree<T> left, right;

    public BinarySearchTree(T data){
        this.data=data;
    }
}