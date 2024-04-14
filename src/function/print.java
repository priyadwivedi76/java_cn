package src.function;
import java.util.Scanner;


public class print {
     static void printNum(int n) {
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        return; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printNum(num);
    }
    
}
