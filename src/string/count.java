package string;
import java.util.Scanner;
public class count {
    public static int count(String str) {
        int count=1;
        //counts the number of words used in the sentence
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a==' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(count(str));
    }
}
