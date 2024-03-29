package string;

import java.util.Scanner;

public class substring {
    //print all the possible string
    public static void substring(String str) {
        for(int i=0;i<str.length();i++){ 
            for(int j=i;j<str.length();j++){
                String subs=str.substring(i, j+1);
                System.out.println(subs);
            } 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       substring(str);
    }
}
