package oops.dynamic_array;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d=new DynamicArray();
        for(int i=0;i<100;i++){
        d.add(i+10);
        }

        System.out.println(d.size());

        d.set(4,10);

        System.out.println(d.get(3));
        System.out.println(d.get(4));

        while(!d.isEmpty()){
            System.out.println(d.removeLast());
            System.out.println("size:"+d.size());
        }
    }   
}

class DynamicArray{
    private int data[];
    private int nextIndex;

    //constructor
    public DynamicArray(){
        data=new int[5];
        nextIndex=0;
    }

    public void add(int element){
        if(data.length==nextIndex){
            restructure();
        }
        data[nextIndex]=element;
        nextIndex++;
    }

    //restructure
    public void restructure(){
        int temp[]=data;
        data=new int[data.length*2];

        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }

    //get element
    public int get(int index){
        if(index>=nextIndex){
            return -1;
        }
        return data[index];
    }

    //set elements
    public void set(int index,int element){
        if(index<nextIndex){
            data[index]=element;
        }else if(index==nextIndex){
            add(element);
        }else{
            return;
        }
    }

    //empty
    public boolean isEmpty(){
        if(nextIndex==0){
            return true;
        }else{
            return false;
        }
    }

    public int removeLast(){
        int value=data[nextIndex-1];
        data[nextIndex-1]=0;
        nextIndex--;
        return value;
    }

    public int size(){
        return nextIndex;
    }
    
}
