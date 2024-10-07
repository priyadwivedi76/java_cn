package queue;
import java.util.Stack;
public class Using2Stack<T> {
    public static void main(String[] args) {
        UsingStack<Integer> usingStack=new UsingStack<Integer>();
        usingStack.enqueue(10);
        usingStack.enqueue(20);
        System.out.println(usingStack.size());
        System.out.println(usingStack.dequeue());
        System.out.println(usingStack.size());
    }
}

class UsingStack<T>{
    Stack<T> stack1;
    Stack<T> stack2;
    private int size;

    public UsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size=0;
    }

    public void enqueue(T item) {
        stack1.push(item);
        size++;
    }

    public T dequeue(){
        //push all the other items into stack2 excluding the first element that entered into stack1
        while(stack1.size()!=size-1){
            stack2.push(stack1.pop());
        }

        //pop and save the element present in stack1 at last
        T item = stack1.pop();
        size--;

        //after the first element is popped return the elements from stack2 to stack1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        //return the first from stack1
        return item;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }
}
 