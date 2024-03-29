package sort;

import java.util.Scanner;

public class minDiff {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static int min(int[] array1,int[] array2){
        int min=Integer.MAX_VALUE;
        int diff;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                diff=array1[i]-array2[j];
                if((diff<min)&&(diff>=0)){
                    min=diff;
                }
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int arr1[]=takeInput();
        int arr2[]=takeInput();
        System.out.println(min(arr1, arr2));
    }
}
