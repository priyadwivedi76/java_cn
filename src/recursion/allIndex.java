package src.recursion;

public class allIndex {
    public static int[] allIndices(int[] arr, int key, int startIndex){
        //base case
        if(startIndex==arr.length){
            int[] output=new int[0];
            return output;
        }

        //recursive call
        int[] smallOutput=allIndices(arr,key,startIndex+1);
        if(arr[startIndex]==key){
            int[] output=new int[smallOutput.length+1];
            output[0]=startIndex;
            for(int i=0;i<smallOutput.length;i++){
                output[i+1]=smallOutput[i];
            }
            return output;
        }else{
            return smallOutput;
        }
    }
    public static void printAllIndices(int[] arr, int key){
         int[] output =allIndices(arr,key,0);
        System.out.println("The total elements are:"+output.length);
        for (int j : output) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[] num={5,6,4,5,6,4};
        printAllIndices(num,4);
    }
}
