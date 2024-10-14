package tree;
import java.util.ArrayList;
import java.util.Scanner;

public class input {
    public static Tree<Integer> takeInput(){
        int n;
        System.out.println("Enter the node of the tree");
        Scanner sc=new Scanner(System.in);

        //Enter the root node
        n=sc.nextInt();

        //make a tree and add root node
        Tree<Integer> root=new Tree<Integer>(n);
        System.out.println("Enter the child count");

        //Enter the number of children for the root node
        int childCount=sc.nextInt();

        //Enter the children nodes recursively
        for(int i=0;i<childCount;i++){
            Tree<Integer> child=takeInput();
            //add the child to the root node
            root.children.add(child);
        }
        return root;
    }


    public static void printTree(Tree<Integer> root){
        String s=root.data+" ";
        //print root data and its children
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
    
        //print the children of the root
        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Tree<Integer> root=takeInput();
        printTree(root);
    }
}



class Tree<T>{
    T data;
    ArrayList<Tree<T>> children;
    public Tree(T data){
        this.data=data;
        children = new ArrayList<>();
    }
}
