package stack;

import java.util.Scanner;

public class doubleCapacity{
    public static void main(String[] args) throws StackEmptyException{
        Scanner sc=new Scanner(System.in);

        //enter the size of stack
        System.out.println("Enter the size of stack:");
        int size=sc.nextInt();

        //new stack
        StackUsingArray stack=new StackUsingArray(size);
        int arr[]={1,2,3,4};

        //elements of array push into stack
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        //pop elements from stack and print them
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

    //create dynamic stack
    public void doubleCapacity() {
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=1;i<temp.length;i++){
            data[i]=temp[i];
        }
    }

    //push
    public void push(int elem){
        //stack-full
        if(topIndex == data.length-1){
            doubleCapacity();
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

class StackEmptyException extends Exception{
    
}
