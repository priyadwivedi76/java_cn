package string;

import java.util.Scanner;

public class reverseEach {
    public static String ReverseEach(String str) {
        int i=0;
        String ans="";
        int StartWord=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                int EndWord=i-1;
                String Reversedword="";
                for(int j=StartWord;j<=EndWord;j++){
                    Reversedword=str.charAt(j)+Reversedword;
                }
                ans=ans+Reversedword+" ";
                StartWord=i+1;
            }
        }
            int EndWord=i-1;
                String Reversedword="";
                for(int j=StartWord;j<=EndWord;j++){
                    Reversedword=str.charAt(j)+Reversedword;
                }
                ans=ans+Reversedword;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(ReverseEach(str));
    }
}
