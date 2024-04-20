package src.recursion;
import java.util.Scanner;
public class checkSorted {

    //approach1 (first compare n-1 elements if that is sorted then check for first element and second element)
    public static boolean checkSort(int arr[]){
        //base case
        if(arr.length<=1){
            return true;
        }

        //recursion
        int smallArray[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArray[i-1]=arr[i];
        }
        boolean smallAns=checkSort(smallArray);

        //processing
        if(!smallAns){
            return false;
        }
        if (arr[0] <= arr[1]) {
            return true;
        } else {
            return false;
        }
        }


        //approach2 (firstly compare first and second element and find whether the first two elements are sorted or not if they are sorted check for n-1 terms)
    public static boolean checkSorted2(int arr[]){
        //base case
        if(arr.length<=1){
            return true;
        }

        //processing
        if(arr[0]>arr[1]){
            return false;
        }

        //recursion
        int smallArray[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArray[i-1]=arr[i];
        }
        boolean res=checkSorted2(smallArray);
        return res;
    }
    public static void main(String[] args) {
        int[] arr ={4,2,3,4,9};
        System.out.println(checkSorted2(arr));
    }
}
