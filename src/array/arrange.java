package array;
import java.util.Scanner;
public class arrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int array[]=new int[num];
        int count=1;
        int ptr1=0;
        int ptr2=num-1;
        while(ptr1<ptr2){
            array[ptr1++]=count++;
            array[ptr2--]=count++;
        }
        if(num%2!=0){
            array[ptr1]=count;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
