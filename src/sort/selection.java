package sort;
import java.util.Scanner;
public class selection {

    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static int[] selection(int[] array){
        for(int i=0;i<array.length-1;i++){
           int minIndex=i;
           int min=array[i];
           for(int j=i+1;j<array.length;j++){
            if(array[j]<min){
                minIndex=j;
                min=array[j];
            }
           }
           int temp=array[minIndex];
           array[minIndex]=array[i];
           array[i]=temp;
        }
        return array;
    }

    public static void print(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        selection(arr);
        print(arr);
    }
}
