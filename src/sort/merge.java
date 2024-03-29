package sort;

import java.util.Scanner;

public class merge {
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

    public static  int[] merge(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int first[]=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                first[k]=arr1[i];
                i++;
                k++;
            }
            else{
            first[k]=arr2[j];
            j++;
            k++;
            }
        }

        while(i<arr1.length){
            first[k]=arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            first[k]=arr2[j];
            j++;
            k++;
        }
        return first;
        }

        public static void main(String[] args) {
            int array1[]=takeInput();
            int array2[]=takeInput();
            print(merge(array1, array2));
        }
    }
