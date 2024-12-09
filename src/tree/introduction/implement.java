package tree;

public class implement {
    public static void main(String[] args) {
        Tree<Integer> root=new Tree<>(20);
        Tree<Integer> node1=new Tree<>(30);
        Tree<Integer> node2=new Tree<>(40);
        Tree<Integer> node3=new Tree<>(40);
        Tree<Integer> node4=new Tree<>(50);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        System.out.println(root);
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
