package string;

import java.util.Scanner;

public class substring2 {
    public static void substring(String str) {
        for(int length=1;length<=str.length();length++){
            for(int start=0;start<=str.length()-length;start++){
                int end=start+length-1;
                String substring=str.substring(start, end+1);
                System.out.println(substring);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       substring(str);
    }
}
