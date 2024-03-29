package sort;

import java.util.Scanner;

public class sort {
    public static void print(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }


    public static int[] takeInput(){
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         return arr;
    }

    public static int[] Sort(int[] array) {
        int i=0;
        int P0=0;
        int P2=array.length-1;
        while(i<P2){
            if(array[i]==0){
            int temp=array[P0];
            array[P0]=array[i];
            array[i]=temp;

            P0++;
            i++;
            }

            else if(array[i]==2){
                int temp=array[P2];
                array[P2]=array[i];
                array[i]=temp;
    
                P2--;
                }
            
            else{
                i++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        Sort(arr);
        print(arr);
    }

}
