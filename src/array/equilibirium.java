package array;
import java.util.Scanner;

public class equilibirium {
    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int array[]=new int[m];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        return array;
    }
    public static int equilibirium(int[] arr) {
        int total=0;
        int leftSum=0;
        int rightSum;
        int i=0;
        while(i<arr.length){
            total+=arr[i];
            i++;
        }
        int index=0;
        while(index<arr.length){
            rightSum=total-leftSum-arr[index];
            if(leftSum==rightSum){
                return index;
            }else{
                leftSum+=arr[index];
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]=inputArray();
        System.out.println(equilibirium(array));
    }
}
