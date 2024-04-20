package src.recursion;

public class firstIndex {
    public static int index(int arr[],int startIndex,int key,int endIndex){
       if(startIndex>endIndex){
           return -1;
       }
       if(arr[startIndex]==key){
           return startIndex;
       }
      int ans=index(arr,startIndex+1,key,endIndex);
       return ans;
    }

    public static int index(int arr[],int key){
        return  index(arr,0,key, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,4};
        System.out.println(index(arr,4));
    }
}
