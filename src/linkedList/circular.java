package linkedList;
import java.util.LinkedList;

public class circular {
    
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);

        //insertion
        list.add(0,100);

        //get the element at certain position:let us print the first element
        System.out.println("The element at 0th position is:"+list.get(0));

        //size of the linkedlist
        System.out.println("The size of the linkedlist is:"+list.size());

        //transverse
        System.out.println("All the elements in the linkedList are:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
