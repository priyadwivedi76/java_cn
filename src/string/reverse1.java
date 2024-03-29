package string;

import java.util.Scanner;

public class reverse1 {

    public static String reversed(String str){
        String reverse="";
        //reverse method from last of string to first
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(reversed(str));
    }
}
