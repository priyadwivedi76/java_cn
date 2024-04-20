package src.recursion;

public class sumOfElements {
    public static int sum(int arr[]){
        int sum=0;

        //base case
        if(arr.length==0){
            return sum;
        }

        //update / processing
        int[] small=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            small[i-1]=arr[i];
        }


        int total=arr[0]+sum(small);
        return total;
    }

    public static void main(String[] args) {
        int array[]={5,3,4,5,3};
        int total=sum(array);
        System.out.println("The total sum of array are:"+total);
    }
}
