package string;

import java.util.Scanner;

public class palindrome {
    public static void palindrome(String str) {
        //the reverse of the string is equal to the original
        String original=str;
        String rev="";

        //transverse character in string and find the reverse of string
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }

        //compare if rev and original are equal
        boolean result=rev.equals(original);
        if(result==true){
            System.out.print("The string is palindrome");
        }else{
            System.out.print("The string is not palindrome");
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       palindrome(str);
    }
}
