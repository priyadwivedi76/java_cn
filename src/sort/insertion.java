package sort;

import java.util.Scanner;

public class insertion {
     public static int[] takeInput(){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         return arr;
    }
    public static void insertion(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while((j>=0)&&(arr[j]>temp)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return;
    }


    public static void print(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        insertion(arr);
        print(arr);
    }
}
