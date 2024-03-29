package array;
import java.util.Scanner;


public class sort {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int arr[]=array;
        return arr;
    }

    public static void sortArray(int[] arr){
        int countZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        for(int i=0;i<countZero;i++){
            arr[i]=0;
        }
        for(int i=countZero;i<arr.length;i++){
            arr[i]=1;
        }
    }

    public static void printArray(int[] array){
        System.out.print("The elements of array are:[");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("]");
        return;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        sortArray(arr);
        printArray(arr);
    }
    
}
