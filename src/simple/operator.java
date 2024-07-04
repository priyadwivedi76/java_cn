package src.simple;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first=sc.nextInt();
        System.out.print("Enter the second number:");
        int second=sc.nextInt();
        int add=first+second;
        int subtract=first-second;
        int multiply=first*second;
        int divide=(int) first/second;
        int modulus=first%second;
        System.out.println(first+"+"+second+"="+add);
        System.out.println(first+"-"+second+"="+subtract);
        System.out.println(first+"*"+second+"="+multiply);
        System.out.println(first+"/"+second+"="+divide);
        System.out.println(first+" mod "+second+"="+modulus);
    }
}
