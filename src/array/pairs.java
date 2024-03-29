package array;
import java.util.Scanner;
public class pairs {

    public static void printPairs(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("["+array[i]+","+array[j]+"]");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,5};
        printPairs(arr);
    }
}
