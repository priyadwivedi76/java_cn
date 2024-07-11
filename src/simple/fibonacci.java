package src.simple;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order number of the fibonacci series");
        int num= sc.nextInt();
        int a=0;
        int b=1;
        int c;
        int temp;
        System.out.print(a+","+b+",");
         if(num>2){
            for(int i=2;i<num;i++){
                c=a+b;
                temp=a;
                a=b;
                b=c;
                System.out.print(c+",");
            }
        }

    }
}
