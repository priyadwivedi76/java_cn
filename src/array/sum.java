package array;
import java.util.Scanner;

public class sum {
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input[]=new int[size];
        for(int i=0;i<input.length;i++){
             input[i]=s.nextInt();
        }
        return input;  
    }
    public static void main(String[] args) {
        int arr[]=takeInput();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
