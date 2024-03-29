package string;
import java.util.Scanner;


public class allChar {
    //print all character of string in each line individually
    public static void allChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        allChar(str);
    }
}
