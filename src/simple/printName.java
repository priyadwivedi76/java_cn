package src.simple;

import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String str=sc.nextLine();
        System.out.println("Hello\n"+str);
    }
}
