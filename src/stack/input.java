package stack;
import java.util.Scanner;

public class input {
    public static void main(String[] args) throws StackEmptyException,StackFullException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int size=sc.nextInt();
        StackUsingArray stack=new StackUsingArray(size);
        int arr[]={1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        System.out.println("The elements in the stack are:");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
class StackUsingArray{
    private int data[];
    private int topIndex=-1;
    //constructor
    public StackUsingArray(){
        data=new int[10];
    }
    public StackUsingArray(int size){
        data=new int[size];
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
