package stack;
public class implementingStack {
    public static void main(String[] args) throws StackEmptyException,StackFullException{
        StackUsingArray stack=new StackUsingArray();
        stack.push(10);
        System.out.println("The element present at the top of stack is:"+stack.top());
        stack.push(20);
        stack.pop();
        System.out.println("The size of the stack is:"+stack.size());
        System.out.println(stack.isEmpty());
    }
}
class StackUsingArray{
    private int data[];
    private int topIndex=-1;
    //constructor
    public StackUsingArray(){
        data=new int[10];
    }

    //push
    public void push(int elem) throws StackFullException{
        //stack-full
        if(topIndex == data.length-1){
            throw new StackFullException();
        }
        topIndex++;
        data[topIndex]=elem;
    } 

    //pop 
    public int pop() throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;
    }

    //isEmpty
    public boolean isEmpty(){
        if(topIndex == -1){
            return true;
        }else{
            return false;
        }
    }

    //top
    public int top() throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    //size
    public int size(){
        return topIndex+1;
    }
}
class StackFullException extends Exception{
    
}
class StackEmptyException extends Exception{
    
}