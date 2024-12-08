public class constructionTree {
    public static BinaryTree<Integer> buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        int rootNode=preOrder[preStart];
        BinaryTree<Integer> root=new BinaryTree<>(rootNode);

        int k=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inOrder[i]==rootNode){
                k=i;
                break;
            }
        }

        root.left=buildTree(preOrder,preStart+1,preStart+(k-inStart),inOrder,inStart,k-1);
        root.right=buildTree(preOrder,preStart+(k-inStart)+1,preEnd,inOrder,k+1,inEnd);
        return root;
    } 
    public static BinaryTree<Integer> buildTree(int[] preOrder,int[] inOrder){
         return buildTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
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
        int[] preOrder={10,20,40,50,30};
        int[] inOrder={40,20,50,10,30};

        BinaryTree<Integer> majorTree=buildTree(preOrder,inOrder);
        printDetailed(majorTree);
    }
}
class BinaryTree<T>{
    BinaryTree<T> left,right;
    T data;

    public BinaryTree(T data){
        this.data=data;
    }
}
