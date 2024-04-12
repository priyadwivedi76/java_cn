package src.array;
import java.util.Scanner;
public class addFloat {
    public static void main(String[] args) {
        System.out.println("Enter the elements in array:");
        float[] array1 =takeInput();
        float total=0;
        for (float v : array1) {
            total += v;
        }
        System.out.println("The total of array is:"+total);
    }

    public  static float[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        float array[]=new float[num];
        for(int i=0;i<num;i++){
            array[i]= sc.nextFloat();;
        }
        return  array;
    }
}
