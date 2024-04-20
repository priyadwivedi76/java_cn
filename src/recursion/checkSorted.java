package src.recursion;
public class checkSorted {

    //approach1 (first compare n-1 elements if that is sorted then check for first element and second element)
    public static boolean checkSort(int[] arr){
        //base case
        if(arr.length<=1){
            return true;
        }

        //recursion
        int[] smallArray =new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArray[i-1]=arr[i];
        }
        boolean smallAns=checkSort(smallArray);

        //processing
        if(!smallAns){
            return false;
        }
        return arr[0] <= arr[1];
        }


        //approach2 (firstly compare first and second element and find whether the first two elements are sorted or not if they are sorted check for n-1 terms)
    public static boolean checkSorted2(int[] arr){
        //base case
        if(arr.length<=1){
            return true;
        }

        //processing
        if(arr[0]>arr[1]){
            return false;
        }

        //recursion
        int[] smallArray =new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArray[i-1]=arr[i];
        }
        return checkSorted2(smallArray);
    }

    //approach3 -better space complexity
    public static boolean checkSorted3(int[] arr,int startIndex){
        if(startIndex==arr.length-1){
            return true;
        }
        if(arr[startIndex]>arr[startIndex+1]){
            return true;
        }
        boolean ans=checkSorted3(arr,startIndex+1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,9};
        System.out.println(checkSorted3(arr,0));
    }
}
