package sort;

import java.util.Scanner;
import java.util.Arrays;

public class count {
    public static int[] takeInput(){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         return arr;
    }

    public static void print(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }

    // public static int[] Count(int[] arr1,int[] arr2){
    //     int count=0;
    //     int first[]=new int[arr1.length];
    //     int low=0;
    //     int high=arr2.length-1;
    //     Arrays.sort(arr2);
    //     for(int i=0;i<arr1.length;i++){

    //         while(low<=high){
    //         int mid=(low+high)/2;

    //         if(arr2[mid]<=arr1[i]){
    //             count=mid+1;
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }

    //     first[i]=count;

    //     }
    //     return first;
    // }


    public static int[] count(int a[],int b[]) {
        int ans[]=new int[a.length];
            for(int i=0;i<a.length;i++){
                int count=0;
                for(int j=0;j<b.length;j++){
                    if(a[i]>b[j]){
                        count=count+1;
                    }
                }
                ans[i]=count;
            }
            return ans;
        }
    

    public static void main(String[] args) {
        int arr1[]=takeInput();
        int arr2[]=takeInput();
        print(count(arr1, arr2));
    }
}
