package array;
import java.util.Scanner;
public class largestMax {
    public static int[] arrayStar() {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        return input;
    }

    public static void printArray(int input[]) {
        int size=input.length;
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(input[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
       int array[]=arrayStar();
       printArray(array);
       int Max=Integer.MIN_VALUE;
       for(int i=0;i<array.length;i++){
        if(Max<array[i]){
            Max=array[i];
        }
       }
       System.out.print("The largest number in array is:"+Max);
    }
}
