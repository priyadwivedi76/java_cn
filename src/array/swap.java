package array;
import java.util.Scanner;



public class swap {
    public static int[] inputArray() {
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
        int arr[]=inputArray();
        for(int i=0;i<arr.length;i=i+2){
            if((arr.length)%2==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.print("The array after swap is:");
        printArray(arr);
    }
}
