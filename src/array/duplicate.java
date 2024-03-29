package array;
import java.util.Arrays;
import java.util.Scanner;

public class duplicate {
    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int array[]=new int[m];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }
    //approach 1-O(n^2)
    public static int duplicate(int array[]) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if((i!=j)&&(array[i]==array[j])){
                    return array[j];
                }
            }
        }
        return -1;  
    }

    //approach 2-O(nlogn)
    public static void duplicate2(int arr[]){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.print("The duplicate is:"+arr[i]);
                return;
            }
        }
        return;
    }
    public static void main(String[] args) {
        int array[]=inputArray();
        // int duplicate=duplicate(array);
        // System.out.println(duplicate);
        duplicate2(array);
       } 
}
