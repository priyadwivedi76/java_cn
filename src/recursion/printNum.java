package src.recursion;
import java.util.Scanner;
public class printNum {
    public static void printNumber(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printNumber(num);
    }
}
