package string;

import java.util.Scanner;

public class reverse2 {

    public static String reverse(String str) {
        String reverse="";
        //reverse the string from first to last
        for(int i=0;i<str.length();i++){
            reverse=str.charAt(i)+reverse;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(reverse(str));
    }
}
