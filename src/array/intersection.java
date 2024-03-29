package array;

import java.util.Scanner;

public class intersection {

    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int array[]=new int[m];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }

    public static void intersection(int array1[],int array2[]){
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    System.out.print(array1[i]+" ");
                    array2[j]=Integer.MIN_VALUE;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array1[]=inputArray();
        int array2[]=inputArray();
        intersection(array1, array2);
    }
    
}
