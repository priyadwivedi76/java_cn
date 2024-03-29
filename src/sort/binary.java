package sort;

import java.util.Scanner;

public class binary {
    public static int[] takeInput(){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         return arr;
    }


    public static int BinarySearch(int[] array,int key) {
        int start=0;
        int end=array.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(key==array[mid]){
                System.out.println("The key is found at:"+mid);
                return mid;
            }
            if(key<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=takeInput();
        int key=sc.nextInt();
        BinarySearch(arr, key);
    }
    
}
