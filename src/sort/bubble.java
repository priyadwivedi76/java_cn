package sort;

import java.util.Scanner;

public class bubble {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static void print(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }

    public static int[] bubble(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        bubble(arr);
        print(arr);
    }
}


