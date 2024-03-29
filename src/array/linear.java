package array;
import java.util.Scanner;
public class linear {
    public static int[] arrayStar() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Insert the size of array:");
        int size=sc.nextInt();
        int input[]=new int[size];
        System.out.print("Insert the elements in array to perform the linear search:"); 
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The number of times linear search is to be performed is:");
        int count=sc.nextInt();
        int n=0;
        while(n<=count){
        int array[]=arrayStar();
        System.out.print("The key to be found is:");
        int key=sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println("The key is found at:"+i);
                return;
            }
        }
        System.out.println("-1");
        n++;
    }
}
}
