package src.recursion;

public class lastIndex {
    public static int findLast(int[] arr,int startIndex,int key,int endIndex){
        if(startIndex>endIndex){
            return -1;
        }
        if(arr[endIndex]==key){
            return endIndex;
        }
        int ans=findLast(arr,startIndex,key,endIndex-1);
        return ans;
    }

    //helping function
    public static int findLast(int arr[],int key){
        return findLast(arr,0,key, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,3,5,6,5};
        System.out.println(findLast(arr,6));
    }
}
